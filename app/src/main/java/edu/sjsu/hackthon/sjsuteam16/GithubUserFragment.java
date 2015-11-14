package edu.sjsu.hackthon.sjsuteam16;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import edu.sjsu.hackthon.sjsuteam16.adapter.CardAdapter;
import edu.sjsu.hackthon.sjsuteam16.model.Github;
import edu.sjsu.hackthon.sjsuteam16.service.GithubService;
import edu.sjsu.hackthon.sjsuteam16.service.ServiceFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by yutao on 11/13/15.
 */
public class GithubUserFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GithubUserFragment newInstance(int sectionNumber) {
        GithubUserFragment fragment = new GithubUserFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GithubUserFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_github, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupGithub();
    }

    private void setupGithub() {
        /**
         * Set up Android CardView/RecycleView
         */
        RecyclerView mRecyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        final CardAdapter mCardAdapter = new CardAdapter();
        mRecyclerView.setAdapter(mCardAdapter);

        /**
         * START: button set up
         */
        Button bClear = (Button) getView().findViewById(R.id.button_clear);
        Button bFetch = (Button) getView().findViewById(R.id.button_fetch);
        bClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCardAdapter.clear();
            }
        });

        bFetch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GithubService service = ServiceFactory.createRetrofitService(GithubService.class, GithubService.SERVICE_ENDPOINT);
                for (String login : Data.githubList) {
                    service.getUser(login)
                            .subscribeOn(Schedulers.newThread())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new Subscriber<Github>() {
                                @Override
                                public final void onCompleted() {
                                    // do nothing
                                }

                                @Override
                                public final void onError(Throwable e) {
                                    Log.e("GithubDemo", e.getMessage());
                                }

                                @Override
                                public final void onNext(Github response) {
                                    mCardAdapter.addData(response);
                                }
                            });
                }
            }
        });
        /**
         * END: button set up
         */

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
}
