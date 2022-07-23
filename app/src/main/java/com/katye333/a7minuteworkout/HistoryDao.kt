package com.katye333.a7minuteworkout

import androidx.room.Dao
import androidx.room.Insert

/*
* Dao defines the functions to
* be ran on our table
*/

@Dao
interface HistoryDao {
    @Insert
    suspend fun insert(historyEntity: HistoryEntity)
}