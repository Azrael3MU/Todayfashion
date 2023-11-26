package com.example.todayfashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class SatorisanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satorisan)
        window.statusBarColor= ContextCompat.getColor(this, R.color.black)
        window.statusBarColor= ContextCompat.getColor(this, R.color.black)

    }
}