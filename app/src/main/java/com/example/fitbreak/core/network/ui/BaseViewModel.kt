package com.example.realestateagency1.core.network.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {
    val loading = MutableLiveData<Boolean>()
}