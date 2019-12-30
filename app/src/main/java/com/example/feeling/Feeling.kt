package com.example.feeling

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "feeling")
data class Feeling(

    @PrimaryKey(autoGenerate = true) val id:Int,
    val mood: Int, // 1, 2, 3
    val created_at: Long = System.currentTimeMillis(),
    val remarks: String
)