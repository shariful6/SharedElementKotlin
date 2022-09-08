package com.example.sharedelementkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import com.example.sharedelementkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("Activity 1")

        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            val compat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@MainActivity, binding.imageview1, ViewCompat.getTransitionName(binding.imageview1)!!)
            startActivity(intent,compat.toBundle())
        }

    }
}