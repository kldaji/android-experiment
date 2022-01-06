package com.kldaji.android_experiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kldaji.android_experiment.databinding.ActivityMainBinding
import com.kldaji.android_experiment.multifragment.OneFragment
import com.kldaji.android_experiment.multifragment.TwoFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val oneFragment = OneFragment()
    private val twoFragment = TwoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAddFragmentListener()
    }

    private fun setAddFragmentListener() {
        binding.btnMainAdd1.setOnClickListener {
            with(supportFragmentManager.beginTransaction()) {
                replace(R.id.fc_main_1, oneFragment)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnMainAdd2.setOnClickListener {
            with(supportFragmentManager.beginTransaction()) {
                replace(R.id.fc_main_2, twoFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}
