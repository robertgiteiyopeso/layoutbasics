package com.example.layoutbasics

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityToastBinding

class ToastActiviy : AppCompatActivity(){

    private lateinit var binding: ActivityToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowToast.setOnClickListener {
            Toast.makeText(this, "Hi I'm a toast :>", Toast.LENGTH_LONG).show()
        }

        binding.btnCustomToast.setOnClickListener {
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                setView(R.layout.custom_toast)
//                show()
//            }
            Toast.makeText(this, "I tried da cica e deprecated", Toast.LENGTH_LONG).show()
        }
    }
}
