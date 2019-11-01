package com.example.responsi_068

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Register : AppCompatActivity()  {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.text_nama)
        val username = findViewById<EditText>(R.id.text_user)
        val password = findViewById<EditText>(R.id.text_password)

        sign_in.setOnClickListener() {
            val Nama = nama.text.toString()
            val Username = username.text.toString()
            val Password = password.text.toString()

            val intent = Intent(this, Account_Activity::class.java)
            intent.putExtra("nama", Nama)
            intent.putExtra("username", Username)
            intent.putExtra("password", Password)
            startActivity(intent)
        }
    }
}