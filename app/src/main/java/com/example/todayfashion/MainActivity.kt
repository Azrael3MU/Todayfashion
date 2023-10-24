package com.example.todayfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor=ContextCompat.getColor(this, R.color.black)
        val handler= Handler()
        handler.postDelayed(Runnable(){
            run(){
                val intent=Intent(this, MenuActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out)
                finish()
            }
        },500)
    }
}