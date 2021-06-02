package com.example.layoutbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val img= arrayOf(R.drawable.fruits1,R.drawable.fruits2,R.drawable.fruits3,R.drawable.fruits4,R.drawable.fruits5)
    private val texts= arrayOf("Special Fruit1","Special Fruit2","Special Fruit3","Special Fruit4","Special Fruit5")

    private val desc= arrayOf("fruitplate1","fruitplate2","fruitplate3","fruitplate4","fruitplate4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val recyclerview=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.adapter=CustomAdapter(img,texts,desc)
    }
}