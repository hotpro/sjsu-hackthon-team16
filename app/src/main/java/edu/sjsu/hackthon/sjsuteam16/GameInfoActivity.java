package edu.sjsu.hackthon.sjsuteam16;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import org.w3c.dom.Text;

import java.util.List;

import edu.sjsu.hackthon.sjsuteam16.model.Promotion;
import edu.sjsu.hackthon.sjsuteam16.service.PromotionService;
import edu.sjsu.hackthon.sjsuteam16.service.ServiceFactory;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by yunlongxu on 11/14/15.
 */
public class GameInfoActivity extends AppCompatActivity {
    private TextView login;
    private TextView repos;
    private TextView blog;
    private TextView origin;
    private TextView promo;
    private ImageView pic;
    private DisplayImageOptions options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameinfo_layout);
        login = (TextView) findViewById(R.id.login);
        repos = (TextView) findViewById(R.id.repos);
        blog = (TextView) findViewById(R.id.blog);
        origin = (TextView) findViewById(R.id.origin);
        promo = (TextView) findViewById(R.id.origin);
        pic = (ImageView) findViewById(R.id.pic);
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_stub)
                .showImageForEmptyUri(R.drawable.ic_empty)
                .showImageOnFail(R.drawable.ic_error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPromotion();
    }

    private void getPromotion() {
        PromotionService service = ServiceFactory.createRetrofitService(PromotionService.class, Constant.BASE_URL);
        service.getPromotionById("324752", Constant.CLIENT_ID, Constant.CLIENT_SECRET)
                .enqueue(new Callback<Promotion>() {
                    @Override
                    public void onResponse(Response<Promotion> response, Retrofit retrofit) {
                        if (response.body() != null) {
                            login.setText(response.body().getTITLE());
                            String[] spStr = response.body().getEFFECTIVE_START_TS().split(" ");
                            repos.setText("start: " + spStr[0]);
                            spStr = response.body().getEFFECTIVE_END_TS().split(" ");
                            blog.setText("end: " + spStr[0]);
                            origin.setText("Original Price: $" + response.body().getORIGINAL_PRICE());
                            promo.setText("OnSale Price: $" + response.body().getBENEFIT_VALUE());
                            ImageLoader.getInstance()
                                    .displayImage(response.body().getLARGE_IMAGE_URI(), pic, options, new SimpleImageLoadingListener() {
                                        @Override
                                        public void onLoadingStarted(String imageUri, View view) {
                                        }

                                        @Override
                                        public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                                        }

                                        @Override
                                        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                                        }
                                    }, new ImageLoadingProgressListener() {
                                        @Override
                                        public void onProgressUpdate(String imageUri, View view, int current, int total) {
                                        }
                                    });
                        }
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
    }
}
