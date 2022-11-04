package com.example.proyect

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class EleccionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_eleccion)

        pulsador()

    }

    private fun pulsador(){

        val imgInfo: LinearLayout = findViewById(R.id.pieInfo)
        val imgEjer: LinearLayout = findViewById(R.id.pieEntreno)
        val imgSuper: LinearLayout = findViewById(R.id.pieSuplementos)
        val imgHome: LinearLayout = findViewById(R.id.pieHome)
        val imgEtapas: LinearLayout = findViewById(R.id.pieEtapas)
        val imgApps: LinearLayout = findViewById(R.id.pieApps)

        val imgBiceps: LinearLayout = findViewById(R.id.imgBiceps)
        val imgEspalda: LinearLayout = findViewById(R.id.imgEspalda)
        val imgHombro: LinearLayout = findViewById(R.id.imgHombro)
        val imgPecho: LinearLayout = findViewById(R.id.imgPecho)
        val imgPierna: LinearLayout = findViewById(R.id.imgPierna)
        val imgTriceps: LinearLayout = findViewById(R.id.imgTriceps)

        imgHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imgInfo.setOnClickListener {
            val intent = Intent(this, InformacionActivity::class.java)
            startActivity(intent)
        }

        imgEjer.setOnClickListener {
            val intent = Intent(this, EleccionActivity::class.java)
            startActivity(intent)
        }

        imgSuper.setOnClickListener {
            val intent = Intent(this, SuplementosActivity::class.java)
            startActivity(intent)
        }

        imgEtapas.setOnClickListener {
            val intent = Intent(this, EtapasActivity::class.java)
            startActivity(intent)
        }

        imgApps.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }

        imgBiceps.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }

        imgPierna.setOnClickListener {
            val intent = Intent(this, PiernaActivity::class.java)
            startActivity(intent)
        }

        imgPecho.setOnClickListener {
            val intent = Intent(this, PechoActivity::class.java)
            startActivity(intent)
        }

        imgEspalda.setOnClickListener {
            val intent = Intent(this, EspaldaActivity::class.java)
            startActivity(intent)
        }

        imgHombro.setOnClickListener {
            val intent = Intent(this, HombroActivity::class.java)
            startActivity(intent)
        }

        imgTriceps.setOnClickListener {
            val intent = Intent(this, TricepsActivity::class.java)
            startActivity(intent)
        }

    }

}