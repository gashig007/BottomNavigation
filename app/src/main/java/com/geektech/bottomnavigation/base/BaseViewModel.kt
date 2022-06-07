package com.geektech.bottomnavigation.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BaseViewModel : ViewModel(){
    private var _counter = 0
    var list: ArrayList<String> = ArrayList()
    val counter = MutableLiveData<Int>()

    fun onPlus() {
        _counter++
        counter.value = _counter
    }

    fun onMinus() {
        _counter--
        counter.value = _counter
    }
}