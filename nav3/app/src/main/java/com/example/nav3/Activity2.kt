package com.example.nav3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class Activity2 : AppCompatActivity() {

    companion object {
        const val TO_1 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navigation = findViewById<BottomNavigationView>(R.id.nav_view);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this, About::class.java))
            true
        }

        findViewById<Button>(R.id.bnToFirst)?.setOnClickListener {
            startActivity(Intent(this,
                MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
        findViewById<Button>(R.id.bnToThird)?.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
    }

}