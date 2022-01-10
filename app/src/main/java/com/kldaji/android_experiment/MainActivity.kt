package com.kldaji.android_experiment

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kldaji.android_experiment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setToastButtonListener()
        setSubButtonListener()
//        val dialog = AlertDialog.Builder(applicationContext)
//            .setMessage("123")
//            .create()
//            .show()
    }

    private fun setToastButtonListener() {
        binding.btnMainToast.setOnClickListener {
            Toast.makeText(this, "토스트 메세지", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setSubButtonListener() {
        binding.btnMainSub.setOnClickListener {
            startActivity(Intent(applicationContext,SubActivity::class.java))
        }
    }
}
