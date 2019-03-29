package com.example.lunger.view.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import de.greenrobot.event.EventBus;


/**
 * Created by Allen on 2017/3/31.
 * 在每个Activity基类里面注册EventBus
 */

public abstract class BaseActivity<T> extends FragmentActivity {
    protected Context mContext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        EventBus.getDefault().register(this);
    }

    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    /**
     * 事件回调方法,主线程执行
     *
     * @param event
     */
    public abstract void onEventMainThread(T event);

    public void showProgress() {

    }

    public void hideProgress() {

    }

    public void showMessage(String message) {

    }
}
