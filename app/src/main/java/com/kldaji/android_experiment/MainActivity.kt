package com.kldaji.android_experiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
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
        setShowFragmentListener()
        setHideFragmentListener()
    }

    private fun setAddFragmentListener() {
        binding.btnMainAdd1.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.fc_main_1, oneFragment)
                addToBackStack(null)
            }
        }
        binding.btnMainAdd2.setOnClickListener {
            supportFragmentManager.commit {
                add(R.id.fc_main_1, twoFragment)
                addToBackStack(null)
            }
        }
    }

    private fun setShowFragmentListener() {
        binding.btnMainShow2.setOnClickListener {
            supportFragmentManager.commit {
                show(twoFragment)
            }
        }
    }

    private fun setHideFragmentListener() {
        binding.btnMainHide2.setOnClickListener {
            supportFragmentManager.commit {
                hide(twoFragment)
            }
        }
    }
}
