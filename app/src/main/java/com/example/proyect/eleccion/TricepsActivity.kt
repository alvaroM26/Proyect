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
import com.example.proyect.databinding.ActivityMusculopiernaBinding
import com.example.proyect.databinding.ActivityMusculotricepsBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity

class TricepsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculotricepsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculotriceps)

        binding = ActivityMusculotricepsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val video1: VideoView = findViewById(R.id.video1)
        val video2: VideoView = findViewById(R.id.video2)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)
        mediaController.setAnchorView(video2)

        val onlineUri1: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/extensiondetriceps.mp4?alt=media&token=397b0877-3b8c-48f2-bee2-906024b4a43a")
        val onlineUri2: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/presstriceps.mp4?alt=media&token=25af3ff3-fb30-4d4a-8195-aa679d334915")

        video1.setMediaController(mediaController)
        video1.setVideoURI(onlineUri1)
        video1.requestFocus()

        video2.setMediaController(mediaController)
        video2.setVideoURI(onlineUri2)
        video2.requestFocus()

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