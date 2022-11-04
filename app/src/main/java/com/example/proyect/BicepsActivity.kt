package com.example.proyect

import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class BicepsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculobiceps)

        val video1: VideoView = findViewById(R.id.video1)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)

        val onlineUri1: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/abductor.mp4?alt=media&token=1de86632-5c1c-4fab-92b6-c37c10965465")

        video1.setMediaController(mediaController)
        video1.setVideoURI(onlineUri1)
        video1.requestFocus()
        video1.start()
    }
}