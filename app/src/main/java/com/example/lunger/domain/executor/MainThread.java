package com.example.lunger.domain.executor;

import rx.Scheduler;

/**
 * Created by Lunger on 2016/2/17.
 * 主线程接口
 */
public interface MainThread {

    Scheduler getScheduler();
}
