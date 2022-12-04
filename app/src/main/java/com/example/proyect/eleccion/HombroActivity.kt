package com.example.proyect.eleccion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.R
import com.example.proyect.app.AppsActivity
import com.example.proyect.databinding.ActivityMusculohombroBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity

class HombroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculohombroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculohombro)

        binding = ActivityMusculohombroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)

        binding.nombre2.setOnClickListener {
            val video2: VideoView = findViewById(R.id.video2)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.pajaros)
            video2.setVideoURI(uri)
            video2.setMediaController(mediaController)
        }

        binding.nombre3.setOnClickListener {
            val video3: VideoView = findViewById(R.id.video3)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.elevacionlateral)
            video3.setVideoURI(uri)
            video3.setMediaController(mediaController)
        }

        binding.nombre4.setOnClickListener {
            val video4: VideoView = findViewById(R.id.video4)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.hombroposteroir)
            video4.setVideoURI(uri)
            video4.setMediaController(mediaController)
        }

        binding.nombre5.setOnClickListener {
            val video5: VideoView = findViewById(R.id.video5)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.cubanpress)
            video5.setVideoURI(uri)
            video5.setMediaController(mediaController)
        }

        pulsar()
    }

    private fun pulsar() {
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
    }

}