package com.kldaji.android_experiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kldaji.android_experiment.lifecycle.LifeCycleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate()")
        Log.d("MainActivity", this.toString())
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MainActivity", "onRestoreInstanceState()")
        savedInstanceState.getString(LifeCycleActivity.TEMP_STRING)?.let {
            Log.d("MainActivity", "restored value is $it")
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
        Log.d("MainActivity", this.toString())
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MainActivity", "onSaveInstanceState()")
        outState.putString(TEMP_STRING, "temp")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy()")
    }

    companion object {
        const val TEMP_STRING = "key"
    }
}
