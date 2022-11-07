package com.example.proyect

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.databinding.ActivityEleccionBinding


class EleccionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEleccionBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_eleccion)

        binding = ActivityEleccionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pulsador()

    }

    private fun pulsador(){

        binding.pieHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.pieInfo.setOnClickListener {
            val intent = Intent(this, InformacionActivity::class.java)
            startActivity(intent)
        }

        binding.pieEntreno.setOnClickListener {
            val intent = Intent(this, EleccionActivity::class.java)
            startActivity(intent)
        }

        binding.pieSuplementos.setOnClickListener {
            val intent = Intent(this, SuplementosActivity::class.java)
            startActivity(intent)
        }

        binding.pieEtapas.setOnClickListener {
            val intent = Intent(this, EtapasActivity::class.java)
            startActivity(intent)
        }

        binding.pieApp.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }

        binding.imgBiceps.setOnClickListener {
            val intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }

        binding.imgPierna.setOnClickListener {
            val intent = Intent(this, PiernaActivity::class.java)
            startActivity(intent)
        }

        binding.imgPecho.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }

        binding.imgEspalda.setOnClickListener {
            val intent = Intent(this, EspaldaActivity::class.java)
            startActivity(intent)
        }

        binding.imgHombro.setOnClickListener {
            val intent = Intent(this, HombroActivity::class.java)
            startActivity(intent)
        }

        binding.imgTriceps.setOnClickListener {
            val intent = Intent(this, TricepsActivity::class.java)
            startActivity(intent)
        }

    }

}