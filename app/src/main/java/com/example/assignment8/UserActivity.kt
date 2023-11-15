package com.example.assignment8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment8.databinding.ActivityMainBinding
import com.example.assignment8.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private var Users = mutableListOf<UsersInfo>()
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val intentSaveBtn = Intent(this, MainActivity::class.java)
            startActivity(intentSaveBtn)
        }
    }


}