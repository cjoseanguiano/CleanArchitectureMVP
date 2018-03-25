package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mvp.carlosanguiano.cleanarchitecturemvp.MyAppMVP;
import com.mvp.carlosanguiano.cleanarchitecturemvp.R;
import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base.BaseActivity;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.splash.SplashActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    TextView textViewShow;
    Button buttonLogout;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MyAppMVP) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);
        textViewShow = findViewById(R.id.textViewShow);
        buttonLogout = findViewById(R.id.buttonLogout);
        textViewShow.setText(mainPresenter.getEmailId());

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
