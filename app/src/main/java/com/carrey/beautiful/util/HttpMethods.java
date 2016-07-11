package com.carrey.beautiful.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author : carrey
 * @Date : 16-7-8
 * @describe :
 */
public class HttpMethods<T> {

    private static final int DEFAULT_TIMEOUT = 5;
    private Retrofit mRetrofit;


    public HttpMethods(){
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        mRetrofit =new Retrofit.Builder()
                .baseUrl(UrlConst.Baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(builder.build())
                .build();
    }




}
