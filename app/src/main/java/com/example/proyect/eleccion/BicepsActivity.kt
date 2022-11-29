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
import com.example.proyect.databinding.ActivityMusculobicepsBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity

class BicepsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculobicepsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculobiceps)

        binding = ActivityMusculobicepsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val video1: VideoView = findViewById(R.id.video1)
        val video2: VideoView = findViewById(R.id.video2)
        val video3: VideoView = findViewById(R.id.video3)
        val video4: VideoView = findViewById(R.id.video4)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)
        mediaController.setAnchorView(video2)
        mediaController.setAnchorView(video3)
        mediaController.setAnchorView(video4)

        val onlineUri1: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curldebicepsconmancuernas.mp4?alt=media&token=c35a777f-caa2-4deb-93fc-5b4e13070325")
        val onlineUri2: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curldebicepsbancoscott.mp4?alt=media&token=9f5ca52a-ead0-430e-9049-95cc88cff943")
        val onlineUri3: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curldebicepsmaquina.mp4?alt=media&token=39e8a398-96f4-480f-8d8c-310699e40b84")
        val onlineUri4: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curldebicepsbarra.mp4?alt=media&token=b19a558e-2476-47d2-ac14-277d8e94c321")

        video1.setMediaController(mediaController)
        video1.setVideoURI(onlineUri1)
        video1.requestFocus()
        video1.stopPlayback()

        video2.setMediaController(mediaController)
        video2.setVideoURI(onlineUri2)
        video2.requestFocus()

        video3.setMediaController(mediaController)
        video3.setVideoURI(onlineUri3)
        video3.requestFocus()

        video4.setMediaController(mediaController)
        video4.setVideoURI(onlineUri4)
        video4.requestFocus()

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