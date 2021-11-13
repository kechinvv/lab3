package com.example.nav3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navigation = findViewById<BottomNavigationView>(R.id.nav_view);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this,About::class.java))
            true }

        findViewById<Button>(R.id.bnToFirst)?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
        findViewById<Button>(R.id.bnToSecond)?.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java).setFlags(FLAG_ACTIVITY_CLEAR_TOP))
        }

    }


}