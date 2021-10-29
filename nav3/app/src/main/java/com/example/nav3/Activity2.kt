package com.example.nav3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView


class Activity2 : AppCompatActivity() {

    companion object{
        const val TO_1 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<TextView>(R.id.text_toolbar).text = "Activity 2"
        val navigation = findViewById<BottomNavigationView>(R.id.navigation);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this,About::class.java))
            true }
    }

    fun onButton1Click(view: View?) {
        startActivity(Intent(this,Activity1::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    }

    fun onButton3Click(view: View?) {
        startActivity(Intent(this, Activity3::class.java))
    }
}