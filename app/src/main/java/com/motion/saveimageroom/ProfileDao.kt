package com.motion.saveimageroom

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface ProfileDao {
    @Query("SELECT*FROM Profile")
    fun getAllProfile(): LiveData<List<Profile?>?>?

    @Insert
    fun insertProfile(profile: Profile?)

    @Delete
    fun deleteProfile(profile: Profile?)

    @Update
    fun updateProfile(profile: Profile?)
}