package com.example.lunger.data.net;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Allen on 2016/5/31.
 * 请求拦截器，可选
 */
public class RequestInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        /*Request request = chain.request();

        String url = request.url().url().getPath();

        request = request.newBuilder()
                .url(Config.getServerAddress() + url)
                .addHeader("app-type", "cashier")
                .addHeader("app-version", Config.getPackageVersion())
                .addHeader("deviceplatform", "android")
                .removeHeader("User-Agent")
                .addHeader("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:38.0) Gecko/20100101 Firefox/38.0")
                .build();
        LogUtils.fff("requestUrl: " + request.url().toString());
        Response response = chain.proceed(request);*/

        return null;
    }
}
