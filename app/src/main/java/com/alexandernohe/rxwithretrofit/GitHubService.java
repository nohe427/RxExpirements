package com.alexandernohe.rxwithretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by alex7370 on 4/13/2016.
 */
public interface GitHubService {

    @GET("users/{user}")
    Observable<UsersInfo> getUser(@Path("user") String user);
}
