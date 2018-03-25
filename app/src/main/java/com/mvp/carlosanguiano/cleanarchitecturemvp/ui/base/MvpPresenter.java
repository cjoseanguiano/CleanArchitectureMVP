package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.base;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}
