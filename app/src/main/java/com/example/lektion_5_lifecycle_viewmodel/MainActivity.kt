package com.example.lektion_5_lifecycle_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.lektion_5_lifecycle_viewmodel.databinding.ActivityMainBinding
import com.example.lektion_5_lifecycle_viewmodel.models.Counter

class MainActivity : AppCompatActivity() {

    // Initialization
    private lateinit var binding: ActivityMainBinding
    private lateinit var counter: Counter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Components/Widgets
        val btnAddCounterValue = binding.btnAddCounterValue
        val tvCounterValue = binding.tvCounterValue

        // TODO - Experiment Primary Constructor

        // Assign counter = ViewModel
        counter = ViewModelProvider(this)[Counter::class.java]

        // Default Screen Values
        tvCounterValue.text = counter.getValue().toString()

        // Listeners
        btnAddCounterValue.setOnClickListener {
            counter.add()
            tvCounterValue.text = counter.getValue().toString()
        }

    }
}
