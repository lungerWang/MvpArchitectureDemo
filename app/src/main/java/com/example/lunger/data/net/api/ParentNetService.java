package com.example.lunger.data.net.api;

import com.example.lunger.data.UrlConstant;
import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.domain.model.ParentLibListModel;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Allen on 2016/5/30.
 */
public interface ParentNetService {

    @POST(UrlConstant.GET_PARENT_LIB)
    Observable<ParentLibListModel> getParentLib(@Body ParentLibParam param);

}
