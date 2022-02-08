package com.ethicalHacker.mealmanager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethicalHacker.mealmanager.R
import com.ethicalHacker.mealmanager.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}