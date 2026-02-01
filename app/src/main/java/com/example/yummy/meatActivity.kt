package com.example.yummy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yummy.databinding.ActivityFoodsBinding
import com.example.yummy.databinding.ActivityMeatBinding

class meatActivity : AppCompatActivity() {
    lateinit var binding: ActivityMeatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMeatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.butterchickenBtn.setOnClickListener {
            startActivity(Intent(this,ButterChickenActivity::class.java))


        }
        binding.backBtn.setOnClickListener {
            startActivity(Intent(this,foodsActivity::class.java))


        }

    }
}