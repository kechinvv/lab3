package com.example.nav2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.nav2.Activity2.Companion.TO_1
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        findViewById<TextView>(R.id.text_toolbar).text = "Activity 3"
        val navigation = findViewById<BottomNavigationView>(R.id.navigation);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this,About::class.java))
            true }
    }

    fun onButton1Click(view: View?) {
        setResult(TO_1)
        finish()
    }

    fun onButton2Click(view: View?) {
        finish()
    }

}