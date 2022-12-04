package com.example.proyect.registro

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.proyect.R
import com.example.proyect.inicio.MainActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegistroActivity : AppCompatActivity() {

    private val canalID = "canal1Id"
    val canalNombre = "canal1Nombre"
    private val notificationId = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_registro)

        setup()
        createNotificacion()

    }

    private fun setup() {

        val botonRegistro: Button = findViewById(R.id.btregistro)
        val botonInicio: Button = findViewById(R.id.btiniciosesion)
        val textoEmail: TextView = findViewById(R.id.txtemail)
        val textoPass: TextView = findViewById(R.id.txtpassword)
        val db = FirebaseFirestore.getInstance()

        botonRegistro.setOnClickListener {

            val notificacion = NotificationCompat.Builder(this, canalID).also {
                it.setContentTitle("Registro")
                it.setContentText("Enhorabuena, su cuenta fue creada con exito !")
                it.setSmallIcon(R.drawable.ic_message)
                it.priority = NotificationCompat.PRIORITY_HIGH
            }.build()

            val notificacionManager = NotificationManagerCompat.from(this)

            if (textoEmail.text.isNotEmpty() && textoPass.text.isNotEmpty()) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    textoEmail.text.toString(),
                    textoPass.text.toString()
                ).addOnCompleteListener {

                    if (it.isSuccessful) {

                        notificacionManager.notify(notificationId, notificacion)

                        db.collection("Users").document(textoEmail.text.toString())

                        Toast.makeText(
                            this@RegistroActivity,
                            "Bienvenido a la aplicacion de informacion y entrenamientos",
                            Toast.LENGTH_SHORT
                        ).show()

                        val intent = Intent(this, UsuarioActivity::class.java)
                        startActivity(intent)

                    } else {
                        alertaDeNoRegistro()
                    }
                }
            }

        }

        botonInicio.setOnClickListener {

            if (textoEmail.text.isNotEmpty() && textoPass.text.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    textoEmail.text.toString(),
                    textoPass.text.toString()
                ).addOnCompleteListener {

                    if (it.isSuccessful) {

                        Toast.makeText(
                            this@RegistroActivity,
                            "Bienvenido a la aplicacion de informacion y entrenamientos",
                            Toast.LENGTH_SHORT
                        ).show()

                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    } else {
                        alertaDeNoInicio()
                    }
                }
            }

        }

    }

    private fun alertaDeNoRegistro() {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Error")
        alert.setMessage("Se ha producio un error al registrar al usuario")
        alert.setPositiveButton("Aceptar", null)

        val dialog: AlertDialog = alert.create()
        dialog.show()

    }

    private fun alertaDeNoInicio() {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Error")
        alert.setMessage("Se ha producio un error al iniciar sesion con estas credenciales")
        alert.setPositiveButton("Aceptar", null)

        val dialog: AlertDialog = alert.create()
        dialog.show()

    }

    private fun createNotificacion() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val importance: Int = NotificationManager.IMPORTANCE_HIGH

            val canal = NotificationChannel(canalID, canalNombre, importance).apply {
                lightColor = Color.RED
                enableLights(true)
            }

            val mannager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            mannager.createNotificationChannel(canal)
        }

    }

}