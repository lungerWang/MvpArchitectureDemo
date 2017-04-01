package com.example.lunger.data.net;


import com.example.lunger.data.UrlConstant;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Lunger on 2016/5/30.
 * 请求构建
 */
public abstract class APIBase {

    public <T> T getService(final Class<T> clazz){
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .build();
        return getService(clazz, client);
    }

    public <T> T getService(final Class<T> clazz, OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(UrlConstant.SERVER_ADDRESS)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        T service = retrofit.create(clazz);

        return service;
    }

    public  <T , K extends Call<T>> T call(K call) {
        T resultDTO = null;
        try {
            Response<T> execute = call.execute();
            resultDTO = execute.body();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultDTO;
    }

    public <T> T getParam(String param, Class<T> clazz) {
        return new Gson().fromJson(param, clazz);
    }

}
