package com.example.feeling

import androidx.lifecycle.LiveData

class FeelingRepository (private val feelingDao: FeelingDao){
    val allFeelings: LiveData<List<Feeling>> = feelingDao.getAllFeelings()

    suspend fun insert(feeling:Feeling){
        feelingDao.insertFeeling(feeling)
    }
}