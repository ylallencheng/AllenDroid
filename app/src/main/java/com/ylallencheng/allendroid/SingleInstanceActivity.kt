package com.ylallencheng.allendroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ylallencheng.allendroid.databinding.ActivityMainBinding

class SingleInstanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = "SingleInstance Activity"

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

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("AllenTesting", "NewIntent: $this")
    }
}