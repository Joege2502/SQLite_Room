package com.example.sqliteroom
import androidx.room.Entity
import androidx.room. PrimaryKey

@Entity(tableName = "reminders")
data class Reminder(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val text: String,
    val isCompleted: Boolean
)