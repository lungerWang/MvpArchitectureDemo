package com.example.lunger.domain.interactor;

import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.data.repository.ParentRepository;

import rx.Observable;

/**
 * Created by Lunger on 2017/04/01.
 * Presenter的网络请求分离到Interactor
 */
public class GetParentLibInteractor extends AbstractInteractor {

    private ParentRepository commodityRepository;
    private ParentLibParam param;

    public GetParentLibInteractor(ParentRepository commodityRepository, ParentLibParam param) {
        this.commodityRepository = commodityRepository;
        this.param = param;
    }

    /**
     * 构建请求的Observable
     * @return
     */
    @Override
    protected Observable buildUseCaseObservable() {
        return commodityRepository.getParentLib(param);
    }
}
