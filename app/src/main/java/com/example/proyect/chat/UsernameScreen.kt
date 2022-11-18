package com.example.proyect.chat

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun UsernameScreen(
    viewModel: UsernameViewModel = hiltViewModel(),
    onNavigate : (String) -> Unit
) {

    LaunchedEffect(key1 = true){
        viewModel.onJoInChat.collectLatest { username ->
            onNavigate("chat_screen/$username")
        }
    }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.End) {
        }
    }

}