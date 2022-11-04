package com.example.proyect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.databinding.ActivityAppBinding

class AppsActivity : AppCompatActivity(){

    private lateinit var binding: ActivityAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_app)

        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pulsador()

    }

    private fun pulsador() {

        binding.pieApple.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.apple.com/us/app/activitytracker-pedometer/id993667592"))
            startActivity(webIntent)
        }

        binding.pieAndroid.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bitscoffee.ActivityTracker&hl=es&gl=US"))
            startActivity(webIntent)
        }

        binding.pieApple2.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.apple.com/es/app/myfitnesspal-recetas-a-diario/id341232718"))
            startActivity(webIntent)
        }

        binding.pieAndroid2.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.myfitnesspal.android&hl=es_419&gl=US"))
            startActivity(webIntent)
        }

        binding.pieApple3.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.apple.com/cl/app/wefitter/id1507373654"))
            startActivity(webIntent)
        }

        binding.pieAndroid3.setOnClickListener() {

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.wefitter.app.prod&hl=es_419&gl=US"))
            startActivity(webIntent)
        }

    }
}