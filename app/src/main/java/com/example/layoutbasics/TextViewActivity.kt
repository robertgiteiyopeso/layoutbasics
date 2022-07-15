package com.example.layoutbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityTextViewBinding

class TextViewActivity : AppCompatActivity(){

    private lateinit var binding: ActivityTextViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        binding.btnUp.setOnClickListener {
            count++
            binding.tvCount.setText("hai sa numaram: $count")
        }

        binding.btnDown.setOnClickListener {
            count--
            binding.tvCount.setText("hai sa numaram: $count")
        }
    }

}
