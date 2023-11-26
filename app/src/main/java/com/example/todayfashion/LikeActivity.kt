package com.example.todayfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.todayfashion.databinding.ActivityCatalogBinding
import com.example.todayfashion.databinding.ActivityLikeBinding

class LikeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLikeBinding = ActivityLikeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        val search=binding.search
        search.setOnClickListener {
            val searchIntent= Intent(this,SearchActivity::class.java)
            startActivity(searchIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val bNav=binding.bNav
        bNav.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.home2 -> {
                    val menuIntent = Intent(this, MenuActivity::class.java)
                    startActivity(menuIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.accaunt -> {
                    val accountIntent = Intent(this, AccountActivity::class.java)
                    startActivity(accountIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.catalog2 -> {
                    val catalogIntent = Intent(this, CatalogActivity::class.java)
                    startActivity(catalogIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.favorites2 -> {
                    val likeIntent = Intent(this, LikeActivity::class.java)
                    startActivity(likeIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.basket4 -> {
                    val corzinaIntent = Intent(this, CorzinaActivity::class.java)
                    startActivity(corzinaIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
            }
            true
        }
    }
}