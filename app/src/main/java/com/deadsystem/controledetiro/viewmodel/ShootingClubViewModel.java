package com.deadsystem.controledetiro.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShootingClubViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShootingClubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Shooting Club fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}