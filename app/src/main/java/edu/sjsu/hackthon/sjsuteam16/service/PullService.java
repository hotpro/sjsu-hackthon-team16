package edu.sjsu.hackthon.sjsuteam16.service;

import edu.sjsu.hackthon.sjsuteam16.model.Github;
import edu.sjsu.hackthon.sjsuteam16.model.PullMsg;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by yutao on 11/14/15.
 */
public interface PullService {
    String SERVICE_ENDPOINT = "http://nodered-hengyu.mybluemix.net";

    @GET("/getConsoles")
    Call<PullMsg> getPullMsg();

    @GET("/getConsoles")
    Call<String> getPullMsgString();

    @GET("/users/{login}")
    Call<Github> getUser(@Path("login") String login);
}
