package com.example.lunger.presenter.impl;

import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.data.repository.ParentRepository;
import com.example.lunger.domain.BaseSubscriber;
import com.example.lunger.domain.interactor.GetParentLibInteractor;
import com.example.lunger.domain.model.ParentLibListModel;
import com.example.lunger.presenter.AbstractPresenter;
import com.example.lunger.presenter.GetParentLibPresenter;

import javax.inject.Inject;

/**
 * Created by Lunger on 2016/10/20.
 * 爸妈图书馆Presneter
 */
public class GetParentLibPresenterImpl extends AbstractPresenter implements GetParentLibPresenter {

    private ParentRepository commodityRepository;
    private GetParentLibPresenter.View view;

    /**
     *
     * @param commodityRepository 请求的仓库
     * @param view View层实例
     */
    @Inject
    public GetParentLibPresenterImpl(ParentRepository commodityRepository, View view) {
        this.commodityRepository = commodityRepository;
        this.view = view;
    }

    /**
     *
     * @param categoryId 分类Id参数
     * @param page 请求的页码
     */
    @Override
    public void getParentLib(String categoryId, String page) {
        //控制界面显示加载框
        view.showProgress();
        //请求参数的构造
        ParentLibParam param = new ParentLibParam();
        param.setCatid(page);
        param.setPage("1");
        //Interactor类用于执行请求，一个接口对应一个Interactor
        GetParentLibInteractor interactor = new GetParentLibInteractor(commodityRepository, param);
        interactor.execute(new GetParentLibSubscriber());
    }

    /**
     * 订阅对应的请求事件，回调处理
     */
    private final class GetParentLibSubscriber extends BaseSubscriber<ParentLibListModel> {

        @Override
        public void onCompleted() {
            view.hideProgress();
        }

        @Override
        public void onNext(ParentLibListModel model) {
            view.onGetParentLibSuccess(model);
        }

        @Override
        protected boolean onError(int errorCode, String errorMsg) {
            view.hideProgress();
            view.onGetParentLibFailed(errorCode, errorMsg);
            return true;
        }
    }
}
