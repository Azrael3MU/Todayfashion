package com.example.todayfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.content.ContextCompat
import com.example.todayfashion.databinding.ActivityAccountBinding
import com.example.todayfashion.databinding.ActivityMenuBinding
import com.google.android.material.navigation.NavigationBarView

class AccountActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db=AccountDB.getDb(this)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        val search=binding.search
        search.setOnClickListener {
            val searchIntent=Intent(this,SearchActivity::class.java)
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
        binding.button1.setOnClickListener{
            val item = Item(null,
                binding.login.text.toString().trim(),
                binding.email.text.toString().trim(),
                binding.password.text.toString().trim())
            if (binding.login.text.toString()==""||binding.email.text.toString()==""||binding.password.text.toString()=="")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else{
            Thread{
                db.getDao().insertItem(item)
            }.start()
            val AccInIntent=Intent(this,AccInActivity::class.java)
            startActivity(AccInIntent)
                overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
            }
        }
        binding.textin.setOnClickListener{
            val AccLogIntent=Intent(this,AccLogActivity::class.java)
            startActivity(AccLogIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
    }
}