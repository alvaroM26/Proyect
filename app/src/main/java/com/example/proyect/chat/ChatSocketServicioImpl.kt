package com.example.proyect.chat

import androidx.compose.ui.semantics.SemanticsProperties.Error
import io.grpc.internal.SharedResourceHolder.Resource
import io.ktor.client.*
import io.ktor.client.features.websocket.*
import io.ktor.client.request.*
import io.ktor.http.cio.websocket.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.isActive

class ChatSocketServicioImpl(private val cliente: HttpClient) : ChatSocketService {

    private var socket: WebSocketSession? = null

    override suspend fun iniciarSesion(nombreUsuario: String): Recursos<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun enviarMensajes(mensaje: String) {
        TODO("Not yet implemented")
    }

    override fun observarMensajes(): Flow<Mensaje> {
        TODO("Not yet implemented")
    }

    override suspend fun cerrarSesion() {
        TODO("Not yet implemented")
    }

    companion object {
        //Cambiar por la IP local del ordenador
        const val BASE_URL = "ws://10.0.2.2:8082"
    }

    sealed class Endpoints(val url: String) {
        object ChatSocket : Endpoints("$BASE_URL/chat-sochet")
    }

}