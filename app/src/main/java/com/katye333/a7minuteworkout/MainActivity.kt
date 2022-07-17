package com.katye333.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flStart : FrameLayout = findViewById(R.id.flStart)
        flStart.setOnClickListener {
            Toast.makeText(this@MainActivity, "Start exercising", Toast.LENGTH_SHORT).show()
        }
    }
}