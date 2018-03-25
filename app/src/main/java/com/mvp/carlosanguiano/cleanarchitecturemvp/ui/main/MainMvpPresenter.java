package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.main;

import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpPresenter;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();
}
