package com.example.proyect.chat

data class ChatState(
    val mensajes: List<Mensaje> = emptyList(),
    val isLoading: Boolean = false
)
