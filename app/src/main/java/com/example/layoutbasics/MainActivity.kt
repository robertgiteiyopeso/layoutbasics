package com.example.layoutbasics

import android.content.Intent
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

        binding.btnTextView.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        binding.btnEditText.setOnClickListener {
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }

        binding.btnImageView.setOnClickListener {
            val intent = Intent(this, ImageViewActivity::class.java)
            startActivity(intent)
        }

        binding.btnCheck.setOnClickListener {
            val intent = Intent(this, CheckBoxActivity::class.java)
            startActivity(intent)
        }

        binding.btnToast.setOnClickListener {
            val intent = Intent(this, ToastActiviy::class.java)
            startActivity(intent)
        }

    }
}