package com.ethicalHacker.mealmanager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethicalHacker.mealmanager.R
import com.ethicalHacker.mealmanager.databinding.ActivityMessCreationBinding

class MessCreation : AppCompatActivity() {
    private lateinit var binding: ActivityMessCreationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessCreationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}