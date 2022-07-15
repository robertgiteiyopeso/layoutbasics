package com.example.layoutbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layoutbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener {
            val firstName = binding.etFirstName.text
            val lastName = binding.etLastName.text
            val birthDate = binding.etBirthDate.text
            val country = binding.etCountry.text
            Log.d("MainActivity", "$firstName $lastName born on $birthDate, from $country")
        }
    }
}