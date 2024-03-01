package com.example.lektion_5_lifecycle_viewmodel.models

import androidx.lifecycle.ViewModel

// ViewModel = Survivability of the LifeCycles
class Counter(private var value: Int = 0) : ViewModel() {

    fun add() {
        value++
    }

    fun getValue(): Int {
        return value
    }

}

