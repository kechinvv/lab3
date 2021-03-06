package com.example.nav4

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.Nav4.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class Activity1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        findViewById<TextView>(R.id.text_toolbar).text = "Activity 1"
        val navigation = findViewById<BottomNavigationView>(R.id.navigation);
        navigation.setOnItemSelectedListener { item ->
           if (item.itemId == R.id.navigation_about) startActivity(Intent(this, About::class.java))
            true }
    }

    fun onButton2Click(view: View?) {
        startActivity(Intent(this, Activity2::class.java))
    }

    fun onButton1Click(view: View?) {
        startActivity(Intent(this, Activity1::class.java).setFlags(FLAG_ACTIVITY_SINGLE_TOP))
    }
}