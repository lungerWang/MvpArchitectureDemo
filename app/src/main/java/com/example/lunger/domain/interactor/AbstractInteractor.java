package com.example.lunger.domain.interactor;



import com.example.lunger.domain.executor.MainThread;
import com.example.lunger.domain.executor.ThreadExecutor;
import com.example.lunger.domain.executor.impl.ThreadPoolExecutor;
import com.example.lunger.domain.executor.impl.UIThread;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Alter by sky on 2016/10/17
 * Created by Lunger on 2016/5/17.
 */
public abstract class AbstractInteractor {
    /**
     * 网络请求用线程池里面的线程
     */
    protected static final ThreadExecutor mThreadThreadExecutor = ThreadPoolExecutor.getInstance();

    /**
     * 网络请求回调在主线程
     */
    protected static final MainThread mMainThread = UIThread.getInstance();

    private Subscription subscription = Subscriptions.empty();


    @SuppressWarnings("unchecked")
    public void execute(Subscriber useCaseSubscriber) {
        this.subscription = this.buildUseCaseObservable()
                .subscribeOn(Schedulers.from(mThreadThreadExecutor))
                .observeOn(mMainThread.getScheduler())
                .subscribe(useCaseSubscriber);
    }

    /**
     * 具体的请求由子类去实现
     * @return
     */
    protected abstract Observable buildUseCaseObservable();

    /**
     * Unsubscribes from current {@link rx.Subscription}.
     */
    public void unsubscribe() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

}
