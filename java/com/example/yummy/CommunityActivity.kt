package com.example.yummy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yummy.databinding.ActivityCommunityBinding
import com.example.yummy.databinding.ActivityNotifiBinding

class CommunityActivity : AppCompatActivity() {
    lateinit var binding: ActivityCommunityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityCommunityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.HomeBtn.setOnClickListener {
            startActivity(Intent(this,foodsActivity::class.java))


        }
        binding.communityBtn.setOnClickListener {
            startActivity(Intent(this,CommunityActivity::class.java))


        }
    }
}