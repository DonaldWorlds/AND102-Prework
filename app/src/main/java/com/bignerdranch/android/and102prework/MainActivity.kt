package com.bignerdranch.android.and102prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //view for the button
        var button = findViewById<Button>(R.id.pressmebutton)

        //listener for button
        button.setOnClickListener {
            Log.v("Hello, world","Button clicked")
            Toast.makeText(this, "Hello to you to and welcome to my page", Toast.LENGTH_LONG).show()
        }



    }
}