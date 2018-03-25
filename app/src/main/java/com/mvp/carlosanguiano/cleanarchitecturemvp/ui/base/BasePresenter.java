package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base;

import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {
    private DataManager mDataManager;
    private V mMvpView;

    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
