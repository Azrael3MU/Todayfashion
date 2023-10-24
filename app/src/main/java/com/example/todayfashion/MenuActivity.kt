package com.example.todayfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        window.statusBarColor= ContextCompat.getColor(this, R.color.black)
    }
    fun onClickSatorisan(view: View){
        val MenuIntent= Intent(this, SatorisanActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickDstrezzed(view: View){
        val MenuIntent= Intent(this, DstrezzedActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickWushu(view: View){
        val MenuIntent= Intent(this, WushuActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickAdd(view: View){
        val MenuIntent= Intent(this, AddActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickScippis(view: View){
        val MenuIntent= Intent(this, ScippisActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickNoize(view: View){
        val MenuIntent= Intent(this, NoizeActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickGoldInk(view: View){
        val MenuIntent= Intent(this, GoldInkActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickAlpha(view: View){
        val MenuIntent= Intent(this, AlphaActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickChuringa(view: View){
        val MenuIntent= Intent(this, ChuringaActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickDelSol(view: View){
        val MenuIntent= Intent(this, DelSolActivity::class.java)
        startActivity(MenuIntent)
        overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
    }
    fun onClickMenu(view: View){
        val MenuIntent= Intent(this, MenuActivity::class.java)
        startActivity(MenuIntent)
    }

}