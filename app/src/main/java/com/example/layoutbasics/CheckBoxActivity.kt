package com.example.layoutbasics

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbasics.databinding.ActivityCheckboxBinding

class CheckBoxActivity : AppCompatActivity(){

    private lateinit var binding: ActivityCheckboxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckboxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val checkedMeatId = binding.rgMeat.checkedRadioButtonId
            val checkedMeat = findViewById<RadioButton>(checkedMeatId)
            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked
            val orderString = "Ai comandat un burger de ${checkedMeat.text}" +
                    (if(cheese) "\nBranza" else "") +
                    (if(onions) "\nCeapa" else "") +
                    (if(salad) "\nSalata" else "")
            binding.tvOrder.setText(orderString)
        }

    }
}