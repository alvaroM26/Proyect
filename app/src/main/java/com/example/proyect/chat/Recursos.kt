package com.example.proyect.chat

import io.grpc.internal.SharedResourceHolder.Resource

sealed class Recursos<T>(val data: T?= null, val mensaje: String? = null) {

    class Success<T>(data: T?) : Resource<T> {
        override fun create(): T {
            TODO("Not yet implemented")
        }

        override fun close(instance: T) {
            TODO("Not yet implemented")
        }
    }

    class Error<T>(mensaje:String, data: T? = null): Resource<T> {
        override fun create(): T {
            TODO("Not yet implemented")
        }

        override fun close(instance: T) {
            TODO("Not yet implemented")
        }
    }
}