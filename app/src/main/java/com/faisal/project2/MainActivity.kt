package com.faisal.project2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val logo = findViewById<ImageView>(R.id.logo)

        logo.setOnLongClickListener {
            val intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
            true
        }

    }
}

