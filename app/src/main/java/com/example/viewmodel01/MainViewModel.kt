package com.example.viewmodel01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var mCurrentName: MutableLiveData<String> = MutableLiveData()
    var contador: Int = 0

    fun getCurrentName(): MutableLiveData<String> {
        return mCurrentName
    }


}