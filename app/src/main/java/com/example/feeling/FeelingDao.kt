package com.example.feeling

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeelingDao {
    @Insert
    suspend fun insertFeeling(feeling:Feeling)

    @Query("SELECT * FROM feeling")
    fun getAllFeelings(): LiveData<List<Feeling>>
}