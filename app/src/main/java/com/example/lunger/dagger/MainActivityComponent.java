package com.example.lunger.dagger;

import com.example.lunger.view.activity.MainActivity;

import dagger.Component;

/**
 * Created by Lunger on 2018/2/27 0027.
 */

@Component(modules = PresenterModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
