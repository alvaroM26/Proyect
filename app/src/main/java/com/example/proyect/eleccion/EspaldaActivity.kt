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
import com.example.proyect.databinding.ActivityMusculoespaldaBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity


class EspaldaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculoespaldaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculoespalda)

        binding = ActivityMusculoespaldaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val video1: VideoView = findViewById(R.id.video1)
        val video2: VideoView = findViewById(R.id.video2)
        val video3: VideoView = findViewById(R.id.video3)
        val video4: VideoView = findViewById(R.id.video4)
        val video5: VideoView = findViewById(R.id.video5)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)
        mediaController.setAnchorView(video2)
        mediaController.setAnchorView(video3)
        mediaController.setAnchorView(video4)
        mediaController.setAnchorView(video5)

        val onlineUri1: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/dominadas.mp4?alt=media&token=7b12170e-348b-4b1a-bde6-478baf0ebaaa")
        val onlineUri2: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/remogironda.mp4?alt=media&token=2a5b8842-6d3a-42e8-b5ef-66199c406574")
        val onlineUri3: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/remosentado.mp4?alt=media&token=e177985f-e004-4f3b-b1d4-fc9e6cb275f5")
        val onlineUri4: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/remoconbarrainclinada.mp4?alt=media&token=b2a99c90-6969-4d71-8108-88aa1d51ce56")
        val onlineUri5: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/remoconbarradepie.mp4?alt=media&token=35d98eef-5204-425d-9289-0530d7fad43c")

        video1.setMediaController(mediaController)
        video1.setVideoURI(onlineUri1)
        video1.requestFocus()
        video1.start()

        video2.setMediaController(mediaController)
        video2.setVideoURI(onlineUri2)
        video2.requestFocus()
        video2.start()

        video3.setMediaController(mediaController)
        video3.setVideoURI(onlineUri3)
        video3.requestFocus()
        video3.start()

        video4.setMediaController(mediaController)
        video4.setVideoURI(onlineUri4)
        video4.requestFocus()
        video4.start()

        video5.setMediaController(mediaController)
        video5.setVideoURI(onlineUri5)
        video5.requestFocus()
        video5.start()

        pulsar()
    }

    private fun pulsar(){
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