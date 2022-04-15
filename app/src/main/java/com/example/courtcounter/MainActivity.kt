package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.viewmodel = viewModel

        viewModel.scoreTeamA.observe(this) {
            binding.scoreA.text = it.toString()
        }

        viewModel.scoreTeamB.observe(this) {
            binding.scoreB.text = it.toString()
        }
    }




}