package com.mvp.carlosanguiano.cleanarchitecturemvp.data;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class SharedPrefsHelper {
    public static final String MY_PREF = "MY_PREFS";
    public static final String EMAIL = "EMAIL";
    private SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREF, MODE_PRIVATE);
    }

    void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn);
    }
}
