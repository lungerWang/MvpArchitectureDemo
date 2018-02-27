package com.example.lunger.dagger;

import com.example.lunger.data.repository.ParentRepository;
import com.example.lunger.presenter.GetParentLibPresenter;
import com.example.lunger.presenter.impl.GetParentLibPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lunger on 2018/2/27 0027.
 */

@Module
public class PresenterModule {

    GetParentLibPresenter.View view;
    ParentRepository parentRepository;

    public PresenterModule(GetParentLibPresenter.View view, ParentRepository parentRepository) {
        this.view = view;
        this.parentRepository = parentRepository;
    }

    @Provides
    GetParentLibPresenter provideGetParentLibPresenter(){
        return new GetParentLibPresenterImpl(parentRepository, view);
    }
}
