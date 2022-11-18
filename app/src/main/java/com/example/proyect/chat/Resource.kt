package com.example.proyect.chat

sealed class Resource<T>(val data: T?= null, val mensaje: String? = null) {

    class Success<T>(data: T?): com.example.proyect.chat.Resource<T>(data)
    class Error<T>(mensaje: String, data :T? = null): com.example.proyect.chat.Resource<T>(data, mensaje)

    }