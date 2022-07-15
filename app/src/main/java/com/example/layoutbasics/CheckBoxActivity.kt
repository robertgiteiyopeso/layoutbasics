package com.example.layoutbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityCheckboxBinding

class CheckBoxActivity : AppCompatActivity(){

    private lateinit var binding: ActivityCheckboxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckboxBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}