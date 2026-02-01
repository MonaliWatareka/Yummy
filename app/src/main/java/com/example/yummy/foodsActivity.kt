package com.example.yummy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yummy.databinding.ActivityFoodsBinding
import com.example.yummy.databinding.ActivityStartBinding

class foodsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFoodsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityFoodsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seafoodsBtn.setOnClickListener {
            startActivity(Intent(this,meatActivity::class.java))


        }

        binding.notiBtn.setOnClickListener {
            startActivity(Intent(this,NotifiActivity::class.java))


        }

        binding.communityBtn.setOnClickListener {
            startActivity(Intent(this,CommunityActivity::class.java))


        }
        binding.bookmarkBtn.setOnClickListener {
            startActivity(Intent(this,saveActivity::class.java))


        }

        binding.profileBtn.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))


        }

        binding.accountBtn.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))


        }



    }
}