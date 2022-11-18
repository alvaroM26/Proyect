package com.example.proyect.chat

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val mensajeServidor: ServidorMensaje,
    private val chatSocketServicio: ChatSocketService,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _mensajeTexto = mutableStateOf("")
    val mensajeTexto: State<String> = _mensajeTexto

    private val _state = mutableStateOf<ChatState>(ChatState())
    val state: State<ChatState> = _state

    private val _toastEvent = MutableSharedFlow<String>()
    val toastEvent = _toastEvent.asSharedFlow()

    init {
        savedStateHandle.get<String>("username")?.let { username ->
            viewModelScope.launch {
                val result = chatSocketServicio.iniciarSesion(username)
                when(result){
                    is Resource.Success -> {

                        chatSocketServicio.observarMensajes()
                            .onEach { message ->
                                val newList = state.value.mensajes.toMutableList().apply {
                                    add(0,message)
                                }
                                _state.value = state.value.copy(
                                   mensajes = newList
                                )
                            }.launchIn(viewModelScope)

                    }
                    is Resource.Error -> {
                        _toastEvent.emit(result.mensaje ?: "Error desconocido")
                    }
                }
            }
        }
    }

    fun onMensajeChange(message: String) {
        _mensajeTexto.value = message
    }

    fun disconect() {
        viewModelScope.launch {
            chatSocketServicio.cerrarSesion()
        }

        fun getAllMensaje() {
            viewModelScope.launch {
                _state.value = state.value.copy(isLoading = true)
                val result = mensajeServidor.getAllMensajes()
                _state.value = state.value.copy(
                    mensajes = result,
                    isLoading = false
                )
            }
        }

        fun sendMensaje() {
            viewModelScope.launch {
                if (mensajeTexto.value.isNotBlank())
                    chatSocketServicio.enviarMensajes(mensajeTexto.value)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        disconect()
    }
}