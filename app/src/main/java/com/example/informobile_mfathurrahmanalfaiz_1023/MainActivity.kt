package com.example.informobile_mfathurrahmanalfaiz_1023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.informobile_mfathurrahmanalfaiz_1023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.amongSus?.setOnClickListener {
            val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intentToSecondActivity)
        }

        setContentView(binding.root)
    }
}