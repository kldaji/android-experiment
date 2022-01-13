package com.kldaji.android_experiment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var count = 0

    fun start(callback: () -> Unit) {
        for (i in 0..1000) {
            viewModelScope.launch(Dispatchers.IO) {
                count++
            }
        }
        viewModelScope.launch {
            delay(2000L)
            callback()
        }
    }
}
