package com.example.recycler_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val itemList = listOf(
            Item(1, "Item 1"),
            Item(2, "Item 2"),
            Item(3, "Item 3"),
            Item(4, "Item 4"),
            Item(5, "Item 5"),
            Item(5, "Item 6"),
            Item(5, "Item 7"),
            Item(5, "Item 8"),
            Item(5, "Item 9"),
            Item(5, "Item 10"),
            Item(5, "Item 11"),
            Item(5, "Item 12"),
            Item(5, "Item 13"),
            Item(5, "Item 14"),
            Item(5, "Item 15")
        )
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ItemAdapter(itemList)
        recyclerView.adapter = adapter
    }
}
