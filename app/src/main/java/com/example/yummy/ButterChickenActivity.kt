package com.example.yummy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yummy.databinding.ActivityButterChickenBinding
import com.example.yummy.databinding.ActivityMeatBinding

class ButterChickenActivity : AppCompatActivity() {
    lateinit var binding: ActivityButterChickenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityButterChickenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goBtn.setOnClickListener {
            startActivity(Intent(this,meatActivity::class.java))


        }
    }
}