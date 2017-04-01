package com.example.lunger.data.disk;


import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.data.repository.ParentRepository;
import com.example.lunger.domain.model.ParentLibListModel;

import rx.Observable;

/**
 * Created by Lunger on 2016/10/12.
 * 爸妈图书馆本地缓存、数据库实现类，可根据需求选择是否用
 */
public class DiskParentLibRepositoryImpl implements ParentRepository {


    @Override
    public Observable<ParentLibListModel> getParentLib(ParentLibParam param) {
        return null;
    }
}
