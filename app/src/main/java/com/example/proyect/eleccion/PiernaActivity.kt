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
import com.example.proyect.databinding.ActivityMusculopiernaBinding
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.example.proyect.suplementos.SuplementosActivity

class PiernaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusculopiernaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculopierna)

        binding = ActivityMusculopiernaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val video1: VideoView = findViewById(R.id.video1)
        val video2: VideoView = findViewById(R.id.video2)
        val video3: VideoView = findViewById(R.id.video3)
        val video4: VideoView = findViewById(R.id.video4)
        val video5: VideoView = findViewById(R.id.video5)
        val video6: VideoView = findViewById(R.id.video6)
        val video7: VideoView = findViewById(R.id.video7)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)
        mediaController.setAnchorView(video2)
        mediaController.setAnchorView(video3)
        mediaController.setAnchorView(video4)
        mediaController.setAnchorView(video5)
        mediaController.setAnchorView(video6)
        mediaController.setAnchorView(video7)

        val onlineUri1: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/sentadillas.mp4?alt=media&token=5da35022-beaa-4655-880a-4e1afa2a144c")
        val onlineUri2: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/extensiondepierna.mp4?alt=media&token=1d1998bd-823f-47d9-94e1-ad8c94a8ef6f")
        val onlineUri3: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/gemelos.mp4?alt=media&token=79b838d3-d170-4c7a-973e-a5f6a7175ace")
        val onlineUri4: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/adductor.mp4?alt=media&token=2d84c9db-8970-46e1-be61-d581648e0199")
        val onlineUri5: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/abductor.mp4?alt=media&token=1de86632-5c1c-4fab-92b6-c37c10965465")
        val onlineUri6: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curldepierna.mp4?alt=media&token=c69ba8b7-8ad0-4686-b997-a679832e97fd")
        val onlineUri7: Uri =
            Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/curl.mp4?alt=media&token=6e7aa4d8-6b32-475f-b1a5-588ff4d37a0b")

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

        video6.setMediaController(mediaController)
        video6.setVideoURI(onlineUri6)
        video6.requestFocus()
        video6.start()

        video7.setMediaController(mediaController)
        video7.setVideoURI(onlineUri7)
        video7.requestFocus()
        video7.start()

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