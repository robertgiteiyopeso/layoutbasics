package com.example.layoutbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityEditTextBinding

class EditTextActivity :AppCompatActivity(){

    private lateinit var binding: ActivityEditTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
