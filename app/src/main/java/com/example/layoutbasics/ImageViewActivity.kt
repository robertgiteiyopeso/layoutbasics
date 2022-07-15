package com.example.layoutbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity(){

    private lateinit var binding: ActivityImageViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
