package com.example.responsi_068

import android.os.Bundle
import android.widget.ListAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home_Activity : AppCompatActivity() {
    private lateinit var  rvFoto: RecyclerView
    private var list:ArrayList<Foto> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        rvFoto = findViewById(R.id.rv_foto)
        rvFoto.setHasFixedSize(true)
        list.addAll(FotoData.listFoto)
        showFotoList()
    }
    private fun showFotoList() {
        rvFoto.layoutManager = LinearLayoutManager(this)
        val listfotoadapter = List_Adapter(list)
        rvFoto.adapter = listfotoadapter

    }
}