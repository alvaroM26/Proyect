package com.example.proyect.eleccion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.*
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

        val onlineUri1: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/prensadepecho.mp4?alt=media&token=a8ffa973-79ba-4dc7-bf2a-939af8318487")
        val onlineUri2: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/fondosasistidos.mp4?alt=media&token=6ebd845b-b2bb-484e-984e-d96a8a229c46")
        val onlineUri3: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/cierredepolea.mp4?alt=media&token=797bae3e-78b7-4314-b164-fc1b9056a5a6")
        val onlineUri4: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/contractorpeckfly.mp4?alt=media&token=ed30074b-af9a-4595-8d4e-56f0e9b33aed")

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

        binding.pieApps.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }
    }

}