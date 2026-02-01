package com.example.yummy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yummy.databinding.ActivityMeatBinding
import com.example.yummy.databinding.ActivityNotifiBinding

class NotifiActivity : AppCompatActivity() {
    lateinit var binding: ActivityNotifiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityNotifiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            startActivity(Intent(this,foodsActivity::class.java))


        }
        binding.bookmarkBtn.setOnClickListener {
            startActivity(Intent(this,saveActivity::class.java))


        }
    }
}