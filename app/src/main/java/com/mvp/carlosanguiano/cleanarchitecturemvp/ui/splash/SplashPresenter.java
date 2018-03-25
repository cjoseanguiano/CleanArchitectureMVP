package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.splash;

import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.BasePresenter;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpPresenter;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpView;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
