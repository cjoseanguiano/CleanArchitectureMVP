package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.main;

import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.BasePresenter;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpPresenter;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {


    public MainPresenter(DataManager mDataManager) {
        super(mDataManager);
    }


    @Override
    public String getEmailId() {
        return getDataManager().getEmailid();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
