package com.example.responsi_068

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sign

class MainActivity : AppCompatActivity() {

        @SuppressLint("WrongViewCast")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val username = findViewById<EditText>(R.id.text_user)
            val password = findViewById<EditText>(R.id.text_password)

            sign_in.setOnClickListener(){
                if (username.text.toString()== "diah" && password.text.toString()== "123"){
                    intent = Intent(this, Home_Activity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(applicationContext,"Coba Lagi Loginnya ya!!",Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }
