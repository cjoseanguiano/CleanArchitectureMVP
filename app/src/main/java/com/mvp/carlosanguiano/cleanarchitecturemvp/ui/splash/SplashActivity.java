package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.main.MainActivity;
import com.mvp.carlosanguiano.cleanarchitecturemvp.MyAppMVP;
import com.mvp.carlosanguiano.cleanarchitecturemvp.R;
import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.BaseActivity;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.login.LoginActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        DataManager dataManager = ((MyAppMVP) getApplication()).getDataManager();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }
}
