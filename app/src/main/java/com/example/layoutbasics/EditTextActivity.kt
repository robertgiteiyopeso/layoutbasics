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

        binding.btnAdd.setOnClickListener {
            val firstNr = binding.etFirstNr.text.toString().toInt()
            val secondNr = binding.etSecondNr.text.toString().toInt()
            val result = firstNr + secondNr
            binding.tvResult.setText(result.toString())
        }
    }
}
