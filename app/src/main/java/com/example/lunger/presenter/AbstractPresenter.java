package com.example.lunger.presenter;


/**
 * Created by Lunger on 2017/03/31.
 * 由于不想让Presneter和Activity生命绑定，所以有这个类复写了对应方法，子类不用再去复写。
 */
public abstract class AbstractPresenter implements BasePresenter {

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }
}
