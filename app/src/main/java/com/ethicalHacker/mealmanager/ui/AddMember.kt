package com.ethicalHacker.mealmanager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethicalHacker.mealmanager.R
import com.ethicalHacker.mealmanager.databinding.ActivityAddMemberBinding

class AddMember : AppCompatActivity() {
    private lateinit var binding: ActivityAddMemberBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMemberBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}