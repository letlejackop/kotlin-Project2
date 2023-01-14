package com.faisal.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.lifecycle.ViewModelProvider

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val name = findViewById<TextView>(R.id.editText)
        val password = findViewById<TextView>(R.id.editText2)
        val login = findViewById<Button>(R.id.button)
        supportActionBar?.hide()


        val viewmodel = ViewModelProvider(this)[LoginViewModel::class.java]
        viewmodel.assign(name.text.toString(),password.text.toString())


        login.setOnClickListener {
            viewmodel.assign(name.text.toString(),password.text.toString())
            if (viewmodel.checkName()&&viewmodel.checkPassword()){
                val intent = Intent(applicationContext,HomePageActivity::class.java).putExtra("name",viewmodel.name)
                startActivity(intent)
            }else if (!viewmodel.checkName()){
                Toast.makeText(applicationContext,"Name is incorrect",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Password is incorrect",Toast.LENGTH_LONG).show()
            }


        }
    }
}