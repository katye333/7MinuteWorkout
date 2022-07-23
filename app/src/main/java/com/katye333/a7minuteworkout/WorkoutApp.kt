package com.katye333.a7minuteworkout

import android.app.Application

class WorkoutApp: Application() {

    // Set up the database lazily
    val db by lazy {
        HistoryDatabase.getInstance(this)
    }
}