package com.motion.saveimageroom

import androidx.room.RoomDatabase

abstract class ProfileDb : RoomDatabase() {

    abstract fun profileDao():ProfileDao
}