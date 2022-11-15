package com.example.proyect.suplementos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.proyect.R
import com.example.proyect.app.AppsActivity
import com.example.proyect.databinding.ActivityTiposuplementosBinding
import com.example.proyect.eleccion.EleccionActivity
import com.example.proyect.etapa.EtapasActivity
import com.example.proyect.informacion.InformacionActivity
import com.example.proyect.inicio.MainActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class TipoSuplementosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTiposuplementosBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tiposuplementos)

        binding = ActivityTiposuplementosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pulsar()

        binding.datos.setOnClickListener {
            binding.texto1.visibility = View.GONE
            binding.texto2.visibility = View.GONE
            binding.texto3.visibility = View.GONE
            binding.texto4.visibility = View.GONE

        }

    }

    fun readAminoacidos() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("Aminoacidos (BCAA)").child("informacion").child("0")
            .child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("Aminoacidos (BCAA)").child("informacion").child("0")
            .child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("Aminoacidos (BCAA)").child("informacion").child("0")
            .child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
    }

    fun readCafeina() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("Cafeina").child("informacion").child("3")
            .child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("Cafeina").child("informacion").child("3")
            .child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("Cafeina").child("informacion").child("3")
            .child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
    }

    fun readGlutamina() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("Glutamina").child("informacion").child("1")
            .child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("Glutamina").child("informacion").child("1")
            .child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("Glutamina").child("informacion").child("1")
            .child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
    }

    fun readProteina() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("Proteinas").child("informacion").child("0")
            .child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("Proteinas").child("informacion").child("0")
            .child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("Proteinas").child("informacion").child("0")
            .child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
    }

    fun readPreWork() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("Suplemento de pre-entrenos").child("informacion")
            .child("2").child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("Suplemento de pre-entrenos").child("informacion")
            .child("2").child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("Suplemento de pre-entrenos").child("informacion")
            .child("2").child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
    }

    fun readCreatina() {
        val database =
            Firebase.database("https://proyect-2022-default-rtdb.firebaseio.com/").reference
        database.child("suplemento").child("creatina").child("informacion").child("3")
            .child("nombre")
            .get().addOnSuccessListener {
                binding.nombreSuplemento.text = it.value.toString()
                binding.lineartotal.visibility = View.VISIBLE
            }
        database.child("suplemento").child("creatina").child("informacion").child("3")
            .child("descripcion")
            .get().addOnSuccessListener {
                binding.descripcionSuple.text = it.value.toString()

            }
        database.child("suplemento").child("creatina").child("informacion").child("3")
            .child("imagen")
            .get().addOnSuccessListener {
                Glide.with(this).load(it.value.toString()).into(binding.imagensuple)
            }
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