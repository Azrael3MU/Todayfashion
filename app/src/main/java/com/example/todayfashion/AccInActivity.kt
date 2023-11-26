package com.example.todayfashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.todayfashion.databinding.ActivityAccInBinding
import com.example.todayfashion.databinding.ActivityAccountBinding

class AccInActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
    }
}