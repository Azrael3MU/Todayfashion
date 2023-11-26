package com.example.todayfashion

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.todayfashion.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMenuBinding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val satorisan=binding.satorisan
        satorisan.setOnClickListener{
            val satorisanIntent= Intent(this, SatorisanActivity::class.java)
            startActivity(satorisanIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minisatorisan=binding.miniSatoriasn
        minisatorisan.setOnClickListener{
            val minisatorisanIntent= Intent(this, SatorisanActivity::class.java)
            startActivity(minisatorisanIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val dstrezzed=binding.dstrezzed
        dstrezzed.setOnClickListener{
            val dstrezzedIntent= Intent(this, DstrezzedActivity::class.java)
            startActivity(dstrezzedIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minidstrezzed=binding.miniDstrezzed
        minidstrezzed.setOnClickListener{
            val minidstrezzedIntent= Intent(this, DstrezzedActivity::class.java)
            startActivity(minidstrezzedIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val wushu=binding.wushu
        wushu.setOnClickListener{
            val wushuIntent= Intent(this, WushuActivity::class.java)
            startActivity(wushuIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val miniwushu=binding.miniWushu
        miniwushu.setOnClickListener{
            val miniwushuIntent= Intent(this, WushuActivity::class.java)
            startActivity(miniwushuIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val miniadd=binding.miniAdd
        miniadd.setOnClickListener{
            val addIntent= Intent(this, AddActivity::class.java)
            startActivity(addIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val miniscippis=binding.miniScippis
        miniscippis.setOnClickListener {
            val scippisIntent= Intent(this, ScippisActivity::class.java)
            startActivity(scippisIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val mininoize=binding.miniNoize
        mininoize.setOnClickListener {
            val noizeIntent= Intent(this, NoizeActivity::class.java)
            startActivity(noizeIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minigoldink=binding.miniGoldInk
        minigoldink.setOnClickListener {
            val goldinkIntent= Intent(this, GoldInkActivity::class.java)
            startActivity(goldinkIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val alpha=binding.alpha
        alpha.setOnClickListener{
            val alphaIntent= Intent(this, AlphaActivity::class.java)
            startActivity(alphaIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minialpha=binding.miniAlpha
        minialpha.setOnClickListener {
            val minialphaIntent= Intent(this, AlphaActivity::class.java)
            startActivity(minialphaIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minichuringa=binding.miniChuringa
        minichuringa.setOnClickListener {
            val churingaIntent= Intent(this, ChuringaActivity::class.java)
            startActivity(churingaIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val minidelsol=binding.miniDelSol
        minidelsol.setOnClickListener {
            val delsolIntent= Intent(this, DelSolActivity::class.java)
            startActivity(delsolIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        val search=binding.search
        search.setOnClickListener{
            val searchIntent=Intent(this,SearchActivity::class.java)
            startActivity(searchIntent)
            overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
        }
        window.statusBarColor= ContextCompat.getColor(this, R.color.black)
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home2 ->{
                    val menuIntent= Intent(this, MenuActivity::class.java)
                    startActivity(menuIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.accaunt ->{
                    val accountIntent=Intent(this,AccountActivity::class.java)
                    startActivity(accountIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.catalog2 ->{
                    val catalogIntent=Intent(this,CatalogActivity::class.java)
                    startActivity(catalogIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.favorites2 ->{
                    val likeIntent=Intent(this,LikeActivity::class.java)
                    startActivity(likeIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
                R.id.basket4 ->{
                    val corzinaIntent=Intent(this,CorzinaActivity::class.java)
                    startActivity(corzinaIntent)
                    overridePendingTransition(R.anim.alpha_in2, R.anim.alpha_out2)
                }
            }
            true
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}