package com.carrey.beautiful.server;

import com.carrey.beautiful.bean.Category;
import com.carrey.beautiful.bean.CategoryList;
import com.carrey.beautiful.bean.ImageDetal;
import com.carrey.beautiful.util.UrlConst;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public interface MainApi {


    @GET(UrlConst.category)
    Observable<Category> getCategory();

    @GET(UrlConst.list)
    Observable<CategoryList> getlist(@QueryMap Map<String,String> map);

    @GET(UrlConst.show)
    Observable<ImageDetal> getDetal(@Query("id") String id);


}
