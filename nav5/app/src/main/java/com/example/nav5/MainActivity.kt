package com.example.nav5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val navigation = findViewById<BottomNavigationView>(R.id.navigation);
        navigation.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_about) navController.navigate(R.id.action_global_about)
            true }
    }


}