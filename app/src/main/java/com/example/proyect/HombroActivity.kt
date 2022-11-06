package com.example.proyect

import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class HombroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_musculohombro)

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

        val onlineUri1: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/pressdehombro.mp4?alt=media&token=49ae3b9e-2646-46bf-b012-7c28ddd84c4d")
        val onlineUri2: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/pajaros.mp4?alt=media&token=c05f5ec0-889f-4b39-9674-e7e63b275861")
        val onlineUri3: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/elevacionlateral.mp4?alt=media&token=c06e3892-62b7-4077-845a-134207864f30")
        val onlineUri4: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/hombroposteroir.mp4?alt=media&token=6fc1bee2-a097-40c2-84aa-441dbb9358cb")
        val onlineUri5: Uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/proyect-2022.appspot.com/o/cubanpress.mp4?alt=media&token=3e6d35ab-0498-4699-84c5-f3c7d6b7b237")

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
    }
}