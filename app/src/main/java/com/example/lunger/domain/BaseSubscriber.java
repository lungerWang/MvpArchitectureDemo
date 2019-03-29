package com.example.lunger.domain;


import android.util.Log;

import com.example.lunger.domain.exception.BaseException;
import com.example.lunger.domain.exception.ErrorCode;

import java.net.UnknownHostException;

import rx.Subscriber;

/**
 * Created by Allen on 2016/10/14.
 * BaseSubscriber主要是对请求失败的一些预处理，采用责任链设计模式，
 * 如果子类onError(errorCode.getErrorCode(), errorMsg)返回true，则错误由子类去自己处理，返回false则在这里统一处理；
 */
public class BaseSubscriber<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        ErrorCode errorCode = ErrorCode.SERVER_DATA_ERROR;
        String errorMsg;
        if (e instanceof BaseException) {
            //控制流程内异常
            BaseException ex = (BaseException) e;
            errorCode = ex.getErrorCode();
            errorMsg = e.getMessage();
        } else {
            errorMsg = errorCode.getErrorMessage();
            //未知错误
            if (e instanceof UnknownHostException) {
                //errorMsg = "暂无数据";
            } else if (e instanceof RuntimeException) {
                errorMsg = e.getMessage();
            }

        }
        boolean b = onError(errorCode.getErrorCode(), errorMsg);
        if (!b) {
            //// TODO: 子类如果没有处理异常或者错误，在这里统一处理
            //ToastCommom.ToastShow(errorCode.getErrorMessage());
        }
        e.printStackTrace();
        Log.e("BaseSubscriber:", "----------onError-----------"+e.getMessage());
    }

    protected boolean onError(int errorCode, String errorMsg) {
        return false;
    }


    @Override
    public void onNext(T model) {

    }
}
