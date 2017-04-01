package com.example.lunger.domain.executor.impl;


import com.example.lunger.domain.executor.ThreadExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lunger on 2016/2/17.
 * 线程池
 */
public class ThreadPoolExecutor implements ThreadExecutor {

    private static volatile ThreadPoolExecutor sThreadPoolExecutor;

    private static final int                     CORE_POOL_SIZE  = 3;
    private static final int                     MAX_POOL_SIZE   = 5;
    private static final int                     KEEP_ALIVE_TIME = 120;
    private static final TimeUnit TIME_UNIT       = TimeUnit.SECONDS;
    private static final BlockingQueue<Runnable> WORK_QUEUE      = new LinkedBlockingQueue<Runnable>();

    private java.util.concurrent.ThreadPoolExecutor mThreadPoolExecutor;

    private ThreadPoolExecutor() {
        long keepAlive = KEEP_ALIVE_TIME;
        mThreadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                keepAlive,
                TIME_UNIT,
                WORK_QUEUE);
    }

    public static ThreadPoolExecutor getInstance(){
        if (sThreadPoolExecutor == null) {
            sThreadPoolExecutor = new ThreadPoolExecutor();
        }
        return sThreadPoolExecutor;
    }

    @Override
    public void execute(Runnable command) {
        mThreadPoolExecutor.execute(command);
    }
}
