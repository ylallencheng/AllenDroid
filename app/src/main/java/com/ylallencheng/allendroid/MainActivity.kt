package com.ylallencheng.allendroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ylallencheng.allendroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStartStandard.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }

        binding.buttonStartSingleTop.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }

        binding.buttonStartSingleTask.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }

        binding.buttonStartSingleInstance.setOnClickListener {
            startActivity(Intent(this, SingleInstanceActivity::class.java))
        }

        Log.d("AllenTesting", "Created: $this")
    }
}
