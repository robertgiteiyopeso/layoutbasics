package com.example.layoutbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isImage = false

        binding.btnAddImage.setOnClickListener {
            if (isImage) {
                binding.ivImage.setImageResource(android.R.color.transparent)
                isImage = false
            } else {
                binding.ivImage.setImageResource(R.drawable.pika2)
                isImage = true
            }

        }

    }
}
