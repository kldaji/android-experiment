package com.kldaji.android_experiment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class MainViewModel : ViewModel() {
    var count = 0
    private val mutex = Mutex()

    fun start(callback: () -> Unit) {
        for (i in 0..1000) {
            viewModelScope.launch(Dispatchers.IO) {
                mutex.withLock {
                    count++
                }
            }
        }
        viewModelScope.launch {
            delay(2000L)
            callback()
        }
    }
}
