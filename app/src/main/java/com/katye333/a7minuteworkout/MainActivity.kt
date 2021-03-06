package com.katye333.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katye333.a7minuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Setup view binding so we don't need to do findViewById
    private var binding : ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This variable will contain the entire ActivityMain Constraint Layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)     // Navigate!
            startActivity(intent)
        }

        binding?.flBMI?.setOnClickListener {
            val intent = Intent(this, BMIActivity::class.java)          // Navigate!
            startActivity(intent)
        }

        binding?.flBMI?.setOnClickListener {
            val intent = Intent(this, BMIActivity::class.java)          // Navigate!
            startActivity(intent)
        }

        binding?.flHistory?.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)          // Navigate!
            startActivity(intent)
        }
    }

    // Very Important to always set binding to null
    // Prevents memory leaks
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}