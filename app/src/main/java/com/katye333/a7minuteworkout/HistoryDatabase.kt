package com.katye333.a7minuteworkout

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [HistoryEntity::class], version = 1)
abstract class HistoryDatabase: RoomDatabase() {

    abstract fun historyDao() : HistoryDao

    // @Volatile means that writes to this field are
    // immediately made visible to other threads
    companion object {
        @Volatile
        private var INSTANCE: HistoryDatabase? = null

        // Check if a database already exists
        fun getInstance(context: Context): HistoryDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HistoryDatabase::class.java,
                        "history_database"
                    ).fallbackToDestructiveMigration().build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}