package com.katye333.a7minuteworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/*
* Dao defines the functions to
* be ran on our table
*/

@Dao
interface HistoryDao {
    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    // Get all entries in the history-table and insert into Flow
    @Query("SELECT * FROM `history-table`")
    fun fetchAllDates(): Flow<List<HistoryEntity>>
}