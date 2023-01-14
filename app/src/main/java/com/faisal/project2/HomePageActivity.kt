package com.faisal.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val welcome = findViewById<TextView>(R.id.welcome)
        supportActionBar?.hide()

        welcome.text =intent.getStringExtra("name").toString()
        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}