package com.carrey.beautiful.util;

import com.carrey.beautiful.bean.HttpResult;

import rx.functions.Func1;

/**
 * @author : carrey
 * @Date : 16-7-8
 * @describe :
 */
public class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

    @Override
    public T call(HttpResult<T> tHttpResult) {
        if (tHttpResult.isStatus()){
//
        }
        return tHttpResult.getData();
    }
}
