package com.example.proyect

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyect.databinding.ActivityUsuarioBinding
import com.google.firebase.auth.FirebaseAuth

class UsuarioActivity : AppCompatActivity(){

    private lateinit var binding: ActivityUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_usuario)

        binding = ActivityUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle:Bundle?=intent.extras
        val email:String?=bundle?.getString("email")

        Toast.makeText(this@UsuarioActivity, "Bienvenido a la aplicacion de informacion y entrenamientos", Toast.LENGTH_SHORT).show()

        setup(email?:"")

        binding.inicio.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun setup (email :String){
        binding.usuario.text = email
        binding.cerrarBoton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
        }
    }

}