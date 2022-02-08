package com.ethicalHacker.mealmanager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethicalHacker.mealmanager.databinding.ActivitySigninBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}