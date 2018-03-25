package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.login;

import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpPresenter;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);
}
