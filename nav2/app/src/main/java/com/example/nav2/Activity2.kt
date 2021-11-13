package com.example.nav2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class Activity2 : AppCompatActivity() {

    companion object{
        const val TO_1 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val navigation = findViewById<BottomNavigationView>(R.id.nav_view);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) startActivity(Intent(this,About::class.java))
            true }

        findViewById<Button>(R.id.bnToFirst)?.setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToThird)?.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivityForResult(intent, 0)
        }
    }


    override fun onActivityResult(
        requestCode: Int, resultCode: Int,
        data: Intent?,
    ) {
        if (resultCode == TO_1) finish()
        else super.onActivityResult(requestCode, resultCode, data)
    }
}