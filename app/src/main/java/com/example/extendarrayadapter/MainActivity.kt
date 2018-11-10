package com.example.extendarrayadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("one", "lutti"),
        Word("two", "otiiko"),
        Word("three", "tolookosu"),
        Word("four", "oyyisa"),
        Word("five", "massokka"),
        Word("six", "temmokka"),
        Word("seven", "kenekaku"),
        Word("eight", "kawinta"),
        Word("nine", "wo’e"),
        Word("ten", "na’aacha")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list)
        val adapter = WordAdapter(this, words)

        listView.adapter = adapter
    }
}


