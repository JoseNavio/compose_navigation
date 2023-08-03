package com.navio.compose_navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.navio.compose_navigation.navigation.AppScreens

//todo Why scaffold is force to pass the padding variable
@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(topBar = {
        //todo Use material 3 top bar instead
        TopAppBar(title = { "Primera pantalla" })
    }, content = { padding ->
        FirstContent(
            padding, navController
        )
    })
}

@Composable
fun FirstContent(padding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Prueba de navegación")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text(text = "Ir a Segunda")
        }
    }
}
