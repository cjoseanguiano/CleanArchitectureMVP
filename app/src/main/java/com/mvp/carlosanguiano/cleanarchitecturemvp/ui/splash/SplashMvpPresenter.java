package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.splash;

import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpPresenter;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();
}
