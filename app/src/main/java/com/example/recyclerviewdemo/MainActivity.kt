package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listMovie:ArrayList<Movie> = arrayListOf(Movie("DDLJ",2),Movie("Attack on Titan",10),Movie("Yugioh",7)
            ,Movie("Jab We met",8),Movie("Don",6),Movie("GOod News",5),Movie("Avengers",1)
            ,Movie("Queen",6),Movie("Humshakals",7),Movie("JNMD",10),Movie("Death Note",9))

            Log.d("Tag","${listMovie.size}")

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val recyclerAdapter = RecyclerAdapter(listMovie)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=recyclerAdapter

    }
}