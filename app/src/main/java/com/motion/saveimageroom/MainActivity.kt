package com.motion.saveimageroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.CycleInterpolator
import coil.load

import com.motion.saveimageroom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //add some commit
        val url="/media/images/-1985073712profile.png"
        Log.d("onCreate: ", url)
       binding.imageView.load(url){
//            crossfade(true)
//            crossfade(1000)
//        }

    }

}}