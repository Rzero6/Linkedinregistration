package com.example.linkedin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.linkedin.databinding.ActivityJoinBinding
import com.example.linkedin.databinding.ActivityMainBinding

class JoinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJoinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var login=intent.getStringExtra("login")
        binding.button2.setOnClickListener {
            if(binding.password.visibility==View.VISIBLE) {
                    startActivity(Intent(this,JoinActivity2::class.java))
            } else {
                binding.password.visibility= View.VISIBLE
            }
        }

    }
}