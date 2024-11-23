package com.azim.lab06

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azim.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener {
            binding.infoTextView.text = getString(R.string.coursesText)
        }

        binding.exams.setOnClickListener {
            binding.infoTextView.text = getString(R.string.examsText)
        }

        binding.freelance.setOnClickListener {
            binding.infoTextView.text = getString(R.string.freelanceText)
        }
    }
}