package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.login;

import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.BasePresenter;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}
