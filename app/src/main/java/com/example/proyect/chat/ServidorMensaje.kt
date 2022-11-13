package com.example.proyect.chat

interface ServidorMensaje {

    suspend fun getAllMensajes(): List<Mensaje>

    companion object{
        //Cambiar por la IP local del ordenador
        const val BASE_URL = "HTTP://10.0.2.2:8082"
    }

    sealed class Endpoints(val url:String){
        object GetAllMessages: Endpoints("$BASE_URL/mensajes")
    }
}