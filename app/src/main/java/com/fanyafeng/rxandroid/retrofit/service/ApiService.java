package com.fanyafeng.rxandroid.retrofit.service;

import com.fanyafeng.rxandroid.retrofit.response.TaoBaoGetIpInfoResponse;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by 365rili on 16/6/16.
 */
public interface ApiService {

    @GET("/service/getIpInfo.php")
    Call<TaoBaoGetIpInfoResponse> getIpInfoBean(@Query("ip") String ip);
}