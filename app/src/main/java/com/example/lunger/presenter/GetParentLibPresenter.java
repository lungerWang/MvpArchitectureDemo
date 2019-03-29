package com.example.lunger.presenter;


import com.example.lunger.domain.model.ParentLibListModel;
import com.example.lunger.view.base.BaseView;

/**
 * Created by Allen on 2016/10/20.
 * 每个PresnetgerImpl都有自己对应的父类，在父类里定义P层和V层之间通信的接口（回调）
 */
public interface GetParentLibPresenter {

    interface View extends BaseView {

        void onGetParentLibSuccess(ParentLibListModel data);

        void onGetParentLibFailed(int failCode, String errorMsg);
    }

    void getParentLib(String categoryId, String page);
}
