package com.deadsystem.controledetiro.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AllShotViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AllShotViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is All fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}