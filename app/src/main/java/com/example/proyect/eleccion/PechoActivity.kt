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
import com.example.proyect.databinding.ActivityMusculopechoBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity

class PechoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculopechoBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculopecho)

        binding = ActivityMusculopechoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)

        binding.nombre1.setOnClickListener {
            val video1: VideoView = findViewById(R.id.video1)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.prensadepecho)
            video1.setVideoURI(uri)
            video1.setMediaController(mediaController)
        }

        binding.nombre2.setOnClickListener {
            val video2: VideoView = findViewById(R.id.video2)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.fondosasistidos)
            video2.setVideoURI(uri)
            video2.setMediaController(mediaController)
        }

        binding.nombre3.setOnClickListener {
            val video3: VideoView = findViewById(R.id.video3)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.cierredepolea)
            video3.setVideoURI(uri)
            video3.setMediaController(mediaController)
        }

        binding.nombre4.setOnClickListener {
            val video4: VideoView = findViewById(R.id.video4)
            val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.contractorpeckfly)
            video4.setVideoURI(uri)
            video4.setMediaController(mediaController)
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