package com.ethicalHacker.mealmanager.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethicalHacker.mealmanager.databinding.ActivitySigninBinding
import com.ethicalHacker.mealmanager.ui.fragment.manager.MoneyDeposit

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logInBtn.setOnClickListener {
            startActivity(Intent(this, MoneyDeposit::class.java))
        }
    }
}