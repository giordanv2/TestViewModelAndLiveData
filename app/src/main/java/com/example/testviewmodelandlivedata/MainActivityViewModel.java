package com.example.testviewmodelandlivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private final MutableLiveData<Integer> firstNumber = new MutableLiveData<>();

    public MainActivityViewModel() {
        firstNumber.setValue(0);
    }

    public LiveData<Integer> getFirstNumber() {
        return firstNumber;
    }

    @SuppressWarnings("ConstantConditions")
    void incrementNumber() {
        firstNumber.setValue(firstNumber.getValue() + 1);
    }

    @SuppressWarnings("ConstantConditions")
    void decrementNumber() {
        if(firstNumber.getValue() > 0){
            firstNumber.setValue(firstNumber.getValue() - 1);
        }
    }

    void resetNumber() {
        firstNumber.setValue(0);
    }


}
