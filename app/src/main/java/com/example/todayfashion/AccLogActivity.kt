package com.example.todayfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.asLiveData
import com.example.todayfashion.databinding.ActivityAccInBinding
import com.example.todayfashion.databinding.ActivityAccLogBinding

class AccLogActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccLogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccLogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = AccountDB.getDb(this)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        binding.textreg.setOnClickListener {
            val AccRegIntent = Intent(this, AccountActivity::class.java)
            startActivity(AccRegIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        fun getUser(email:String,password:String):Boolean{
            val db1 =db.getDao().getAllItems()
            val result = db1.run { "SELECT * FROM login WHERE email='$email'AND password='$password'" }
            return result.toBoolean()
        }
    }
}