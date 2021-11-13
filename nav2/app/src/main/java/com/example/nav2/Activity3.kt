package com.example.nav2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nav2.Activity2.Companion.TO_1
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val navigation = findViewById<BottomNavigationView>(R.id.nav_view);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this, About::class.java))
            true
        }

        findViewById<Button>(R.id.bnToFirst)?.setOnClickListener {
            setResult(TO_1)
            finish()
        }
        findViewById<Button>(R.id.bnToSecond)?.setOnClickListener {
            finish()
        }
    }


}