package com.kldaji.android_experiment.lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kldaji.android_experiment.R

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        Log.d("LifeCycleActivity", "onCreate()")
        Log.d("LifeCycleActivity", this.toString())
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycleActivity", "onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleActivity", "onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("LifeCycleActivity", "onRestoreInstanceState()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycleActivity", "onResume()")
        Log.d("LifeCycleActivity", this.toString())
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleActivity", "onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("LifeCycleActivity", "onSaveInstanceState()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleActivity", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleActivity", "onDestroy()")
    }
}
