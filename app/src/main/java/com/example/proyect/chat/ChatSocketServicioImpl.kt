package com.example.proyect.chat

import io.ktor.client.*
import io.ktor.client.features.websocket.*
import io.ktor.client.request.*
import io.ktor.http.cio.websocket.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.isActive
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class ChatSocketServicioImpl(private val cliente: HttpClient) : ChatSocketService {

    private var socket: WebSocketSession? = null

    override suspend fun iniciarSesion(nombreUsuario: String): Resource<Unit> {

        return try{
            socket = cliente.webSocketSession {
                url("${ChatSocketService.Endpoints.ChatSocket.url}?nombreUsuario=$nombreUsuario")
            }
            if (socket?.isActive == true){
               Resource.Success(Unit)
            }else Resource.Error("No se ha podido establecer conexion")
        }catch (e: Exception){
            e.printStackTrace()
           Resource.Error(e.localizedMessage ?: "Error desconocido")
        }
    }

    override suspend fun enviarMensajes(mensaje: String) {

        try {

            socket?.send(Frame.Text(mensaje))

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun observarMensajes(): Flow<Mensaje> {
        return try {

            socket?.incoming
                ?.receiveAsFlow()
                ?.filter { it is Frame.Text }
                ?.map {
                    val json = (it as? Frame.Text)?.readText() ?: ""
                    val mensajeDto = Json.decodeFromString<MensajesDto>(json)
                    mensajeDto.toMensaje()
                } ?: flow {  }

        }catch (e: Exception){
            e.printStackTrace()

            flow {  }
        }
    }

    override suspend fun cerrarSesion() {
        socket?.close()
    }

    companion object {
        //Cambiar por la IP local del ordenador
        const val BASE_URL = "ws://10.0.2.2:8082"
    }

    sealed class Endpoints(val url: String) {
        object ChatSocket : Endpoints("$BASE_URL/chat-sochet")
    }

}