package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mvp.carlosanguiano.cleanarchitecturemvp.MyAppMVP;
import com.mvp.carlosanguiano.cleanarchitecturemvp.R;
import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.main.MainActivity;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.splash.SplashActivity;
import com.mvp.carlosanguiano.cleanarchitecturemvp.ui.utils.CommonUtils;

public class LoginActivity extends AppCompatActivity implements LoginMvpView {

    LoginPresenter loginPresenter;
    EditText editTextEmail, editTextPassword;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DataManager dataManager = ((MyAppMVP) getApplicationContext()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);
        loginPresenter.onAttach(this);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {
        String emailId = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (password.isEmpty()) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        loginPresenter.startLogin(emailId);
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }
}
