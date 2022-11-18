package com.example.proyect.chat

import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun iniciarSesion(
        nombreUsuario: String
    ): Resource<Unit>

    suspend fun enviarMensajes(mensaje: String)

    fun observarMensajes(): Flow<Mensaje>

    suspend fun cerrarSesion()


    companion object{
        //Cambiar por la IP local del ordenador
        const val BASE_URL = "ws://10.0.2.2:8082"
    }

    sealed class Endpoints(val url:String){
        object ChatSocket: Endpoints("$BASE_URL/chat-socket")
    }
}