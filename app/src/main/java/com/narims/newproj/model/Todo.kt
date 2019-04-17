package com.narims.newproj.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class Todo(@PrimaryKey(autoGenerate = true) var id: Int, var text: String)