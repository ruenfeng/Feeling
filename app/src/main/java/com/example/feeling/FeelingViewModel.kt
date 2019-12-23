package com.example.feeling

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class FeelingViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FeelingRepository

    val allFeelings: LiveData<List<Feeling>>

    init{
    }
}