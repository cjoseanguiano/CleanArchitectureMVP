package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.login;

import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.MvpView;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface LoginMvpView extends MvpView {

    void openMainActivity();

    void onLoginButtonClick();
}
