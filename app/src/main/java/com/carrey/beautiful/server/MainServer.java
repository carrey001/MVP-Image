package com.carrey.beautiful.server;

import com.carrey.beautiful.bean.Category;
import com.carrey.beautiful.bean.CategoryList;
import com.carrey.beautiful.bean.ImageDetal;
import com.carrey.beautiful.util.UrlConst;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public class MainServer {


    private Retrofit mRetrofit;

    public MainServer() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(UrlConst.Baseurl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Observable<Category> getCategory() {

        MainApi mainApi = mRetrofit.create(MainApi.class);
        return mainApi.getCategory().subscribeOn(Schedulers.io());
    }

    public Observable<CategoryList> getList(Map<String,String> map) {

        return mRetrofit.create(MainApi.class).getlist(map).subscribeOn(Schedulers.io());
    }

    public Observable<ImageDetal> getDetal(String id) {

        return mRetrofit.create(MainApi.class).getDetal(id).subscribeOn(Schedulers.io());
    }
}
