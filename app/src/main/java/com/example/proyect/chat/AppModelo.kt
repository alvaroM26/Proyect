package com.example.proyect.chat

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.features.websocket.*
import io.ktor.http.cio.websocket.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModelo {

    @Provides
    @Singleton
    fun provideHttClient() : HttpClient {
        return HttpClient(CIO){
            install(Logging)
            install(WebSockets)
            install(JsonFeature){
                serializer = KotlinxSerializer()
            }
        }
    }

    @Provides
    @Singleton
    fun provideMensajeServide(client: HttpClient):ServidorMensaje{
        return ServidorMensajesImplementacion(client)
    }

    @Provides
    @Singleton
    fun provideChatSocketServide(client: HttpClient):ChatSocketService{
        return ChatSocketServicioImpl(client)
    }


}