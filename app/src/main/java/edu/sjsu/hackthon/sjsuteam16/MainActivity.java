package edu.sjsu.hackthon.sjsuteam16;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;


import edu.sjsu.hackthon.sjsuteam16.adapter.CardAdapter;
import edu.sjsu.hackthon.sjsuteam16.model.Github;
import edu.sjsu.hackthon.sjsuteam16.model.PullMsg;
import edu.sjsu.hackthon.sjsuteam16.service.GithubService;
import edu.sjsu.hackthon.sjsuteam16.service.PullService;
import edu.sjsu.hackthon.sjsuteam16.service.ServiceFactory;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;


    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initImageLoader(getApplicationContext());

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                mDrawerLayout);


        handler.sendEmptyMessageDelayed(1, 8000);
    }

    public void initImageLoader(Context context) {
        // This configuration tuning is custom. You can tune every option, you may tune some of them,
        // or you can create default configuration by
        //  ImageLoaderConfiguration.createDefault(this);
        // method.
        ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(context);
        config.threadPriority(Thread.NORM_PRIORITY - 2);
        config.denyCacheImageMultipleSizesInMemory();
        config.diskCacheFileNameGenerator(new Md5FileNameGenerator());
        config.diskCacheSize(50 * 1024 * 1024); // 50 MiB
        config.tasksProcessingOrder(QueueProcessingType.LIFO);
        config.writeDebugLogs(); // Remove for release app

        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config.build());
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        Fragment fragment = null;

        if (position == 0) {
            fragment = PromotionFragment.newInstance(position + 1);
        } else if (position == 1) {
            fragment = GithubUserFragment.newInstance(position + 1);
        } else {
            fragment = PlaceholderFragment.newInstance(position + 1);
            NotificationUtils notificationUtils = new NotificationUtils();
            notificationUtils.showNotification(this, 3);
        }
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void startPull(final MainActivity mainActivity) {

        Log.d("MainActivity", "get startPull: ");

        PullService service = ServiceFactory.createRetrofitService(PullService.class, PullService.SERVICE_ENDPOINT);
//        service.getPullMsg()
//                .enqueue(new Callback<PullMsg>() {
//                    @Override
//                    public void onResponse(Response<PullMsg> response, Retrofit retrofit) {
//                        PullMsg pullMsg = response.body();
//                        if (pullMsg != null) {
//                            Log.d("MainActivity", "get notification: " + pullMsg);
//                            NotificationUtils.showNotification(MainActivity.this, 324752);
//                        }
//
//                        handler.sendEmptyMessageDelayed(1, 3000);
//                    }
//
//                    @Override
//                    public void onFailure(Throwable t) {
//
//                    }
//                });


        service.getPullMsgString()
                .enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Response<String> response, Retrofit retrofit) {
                        String pullMsg = response.body();
                        if (pullMsg != null && !isShowingNotification) {
                            Log.d("MainActivity", "get notification: " + pullMsg);
                            NotificationUtils.showNotification(MainActivity.this, 324752);
                            isShowingNotification = true;
                        }

                        handler.sendEmptyMessageDelayed(1, 8000);
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });

//        service.getUser("hotpro")
//                .enqueue(new Callback<Github>() {
//                    @Override
//                    public void onResponse(Response<Github> response, Retrofit retrofit) {
//                        Github pullMsg = response.body();
//                        if (pullMsg != null) {
//                            Log.d("MainActivity", "get notification");
//                            NotificationUtils.showNotification(MainActivity.this, 324752);
//                        }
//
//                        handler.sendEmptyMessageDelayed(1, 3000);
//                    }
//
//                    @Override
//                    public void onFailure(Throwable t) {
//
//                    }
//                });
    }

    private static boolean isShowingNotification = false;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                startPull(MainActivity.this);
            }
        }
    };
}
