package com.example.lunger.data.repository;


import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.domain.model.ParentLibListModel;

import rx.Observable;

/**
 * Created by Lunger on 2017/3/30.
 */
public interface ParentRepository {

    Observable<ParentLibListModel> getParentLib(ParentLibParam param);

}
