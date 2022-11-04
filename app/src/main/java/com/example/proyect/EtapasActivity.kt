package com.example.proyect

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class EtapasActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_registro)

    }
}