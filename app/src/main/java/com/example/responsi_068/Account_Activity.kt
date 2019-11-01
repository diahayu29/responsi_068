package com.example.responsi_068

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class Account_Activity : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_activity)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val username = bundle?.get("username")
        val password = bundle?.get("password")

        text_nama.text=("Nama: "+("nama"))
        text_user.text=("Username: "+("username"))
        text_password.text=("Password: "+("password"))

    }
}