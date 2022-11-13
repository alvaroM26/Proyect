package com.example.proyect.chat

import io.ktor.client.*
import io.ktor.client.request.*

class ServidorMensajesImplementacion(
    private val cliente: HttpClient
) : ServidorMensaje {

    override suspend fun getAllMensajes(): List<Mensaje> {

        return try {

            cliente.get<List<MensajesDto>>(ServidorMensaje.Endpoints.GetAllMessages.url).map { it.toMensaje() }

        }catch (e:java.lang.Exception){
            emptyList()
        }
    }
}