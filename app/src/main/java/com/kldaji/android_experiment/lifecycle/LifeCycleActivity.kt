package com.kldaji.android_experiment.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kldaji.android_experiment.databinding.ActivityLifecycleBinding

class LifeCycleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
        savedInstanceState.getString(TEMP_STRING)?.let {
            Log.d("LifeCycleActivity", "restored value is $it")
        }
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

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleActivity", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCycleActivity", "onSaveInstanceState()")
        outState.putString(TEMP_STRING, "temp")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleActivity", "onDestroy()")
    }

    companion object {
        const val TEMP_STRING = "key"
    }
}
