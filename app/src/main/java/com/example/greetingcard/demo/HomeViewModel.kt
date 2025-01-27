package com.example.greetingcard.demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _number = MutableLiveData(0)
    val number: LiveData<Int> get() = _number

    fun onChangeNumber() {
        _number.value = (_number.value ?: 0) + 1
    }
}
