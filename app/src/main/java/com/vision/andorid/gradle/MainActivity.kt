package com.vision.andorid.gradle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.BuildCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val a = BuildConfig.BASE_URL
        Toast.makeText(this,a,Toast.LENGTH_LONG).show()

    }
}