package com.motion.saveimageroom

import android.app.Application
import androidx.room.Room

class App: Application() {
    lateinit var profileDb:ProfileDb
    override fun onCreate() {
        super.onCreate()
    }
}