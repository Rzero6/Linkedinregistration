package com.example.linkedin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.linkedin.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.join.setOnClickListener {
            startActivity(Intent(this,JoinActivity::class.java))
        }
        binding.google.setOnClickListener {
            startActivity(Intent(this,JoinActivity::class.java))
        }
        binding.signin.setOnClickListener {
            startActivity(Intent(this,JoinActivity::class.java))
        }
    }
}