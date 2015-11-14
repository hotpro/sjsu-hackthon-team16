package edu.sjsu.hackthon.sjsuteam16;

import java.util.List;

import edu.sjsu.hackthon.sjsuteam16.model.Promotion;
import edu.sjsu.hackthon.sjsuteam16.model.PullMsg;
import edu.sjsu.hackthon.sjsuteam16.service.PromotionService;
import edu.sjsu.hackthon.sjsuteam16.service.PullService;
import edu.sjsu.hackthon.sjsuteam16.service.ServiceFactory;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by yutao on 11/14/15.
 */
public class PullUtils {
    public static void startPull(MainActivity mainActivity) {
        PullService service = ServiceFactory.createRetrofitService(PullService.class, PullService.SERVICE_ENDPOINT);
        service.getPullMsg()
                .enqueue(new Callback<PullMsg>() {
                    @Override
                    public void onResponse(Response<PullMsg> response, Retrofit retrofit) {
                        PullMsg pullMsg = response.body();
                        if (pullMsg != null) {

                        }
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
    }
}
