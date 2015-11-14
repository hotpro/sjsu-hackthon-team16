package edu.sjsu.hackthon.sjsuteam16.service;

import rx.Observable;
import edu.sjsu.hackthon.sjsuteam16.model.Github;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by yutao on 11/13/15.
 */
public interface GithubService {
    String SERVICE_ENDPOINT = "https://api.github.com";

    @GET("/users/{login}")
    Observable<Github> getUser(@Path("login") String login);
}
