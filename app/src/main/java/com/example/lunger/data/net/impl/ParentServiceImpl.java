package com.example.lunger.data.net.impl;


import com.example.lunger.data.net.APIBase;
import com.example.lunger.data.net.api.ParentNetService;
import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.data.repository.ParentRepository;
import com.example.lunger.domain.model.ParentLibListModel;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by Lunger on 2016/5/31.
 *爸妈图书馆网络请求实现类
 */
class ParentServiceImpl extends APIBase implements ParentRepository {


    private ParentNetService getService() {
        return getService(ParentNetService.class);
    }

    @Override
    public Observable<ParentLibListModel> getParentLib(ParentLibParam param) {
        return getService()
                .getParentLib(param);
//                 可以在这里做一些非空校验，或者类型转换，这里是在子线程，比在主线程做非空判断好很多 （可选）
//                .map(new Func1<ParentLibListModel, ParentLibListModel>() {
//                    @Override
//                    public ParentLibListModel call(ParentLibListModel parentLibListModel) {
//                        return parentLibListModel;
//                    }
//                });
    }
}
