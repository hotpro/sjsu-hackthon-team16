package edu.sjsu.hackthon.sjsuteam16.service;

import java.util.List;

import edu.sjsu.hackthon.sjsuteam16.model.Github;
import edu.sjsu.hackthon.sjsuteam16.model.Promotion;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by yutao on 11/13/15.
 */
public interface PromotionService {

    @GET("/gamestop/prod/gamestop/promotions")
    Call<List<Promotion>> getPromotion(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret
    );

    @GET("/gamestop/prod/gamestop/promotions/{id}")
    Call<Promotion> getPromotionById(
            @Path("id") String id,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret
    );
}
