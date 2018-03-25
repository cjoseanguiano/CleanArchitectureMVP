package com.mvp.carlosanguiano.cleanarchitecturemvp;

import android.app.Application;

import com.mvp.carlosanguiano.cleanarchitecturemvp.data.DataManager;
import com.mvp.carlosanguiano.cleanarchitecturemvp.data.SharedPrefsHelper;

/**
 * Created by Carlos Anguiano on 3/24/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class MyAppMVP extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
