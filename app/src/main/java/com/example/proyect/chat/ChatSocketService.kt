package com.example.proyect.chat

import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun iniciarSesion(
        nombreUsuario: String
    ): Recursos<Unit>

    suspend fun enviarMensajes(mensaje: String)

    fun observarMensajes(): Flow<Mensaje>

    suspend fun cerrarSesion()
}