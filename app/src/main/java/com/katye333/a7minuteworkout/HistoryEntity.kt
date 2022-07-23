package com.katye333.a7minuteworkout

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
* Create table "history-table"
* Defines all columns in the table
*/

@Entity(tableName = "history-table")
data class HistoryEntity(
    @PrimaryKey
    val date: String,          // Epoch time
)
