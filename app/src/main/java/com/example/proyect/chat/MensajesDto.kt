package com.example.proyect.chat

import java.text.DateFormat
import java.util.Date

@kotlinx.serialization.Serializable
data class MensajesDto(

    val texto: String,
    val timestamp: Long,
    val nombreUsuario: String,
    val id: String
) {
    fun toMensaje(): Mensaje {

        val fecha = Date(timestamp)

        val formattedFecha = DateFormat.getDateInstance(DateFormat.DEFAULT).format(fecha)

        return Mensaje(
            texto = texto,
            formattedTime = formattedFecha,
            nombreUsuario = nombreUsuario
        )

    }

}
