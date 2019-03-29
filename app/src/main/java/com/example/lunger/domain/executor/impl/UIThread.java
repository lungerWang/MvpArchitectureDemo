package com.example.lunger.domain.executor.impl;


import com.example.lunger.domain.executor.MainThread;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Allen on 2017/04/01.
 * 主线程
 */
public class UIThread implements MainThread {

    private final static UIThread instance = new UIThread();

    public static UIThread getInstance() {
        return instance;
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }

}
