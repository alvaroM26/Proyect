package com.example.proyect.suplementos

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.app.AppsActivity
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.R
import com.example.proyect.databinding.ActivitySuplementosBinding
import com.example.proyect.eleccion.EleccionActivity
import com.example.proyect.inicio.MainActivity

class SuplementosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuplementosBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_suplementos)

        binding = ActivitySuplementosBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.btsuplementos.setOnClickListener {
            val intent = Intent(this, TipoSuplementosActivity::class.java)
            startActivity(intent)
        }
    }
}