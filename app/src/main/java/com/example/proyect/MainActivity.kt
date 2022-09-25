package com.example.proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(1500)

        setTheme(R.style.Theme_Proyect)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}