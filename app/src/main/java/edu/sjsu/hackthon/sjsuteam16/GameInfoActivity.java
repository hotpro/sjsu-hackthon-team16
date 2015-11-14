package edu.sjsu.hackthon.sjsuteam16;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

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

                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
    }
}
