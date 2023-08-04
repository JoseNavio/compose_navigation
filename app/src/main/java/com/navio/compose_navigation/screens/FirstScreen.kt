package com.navio.compose_navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.navio.compose_navigation.navigation.Screens

//todo Why scaffold is force to pass the padding variable
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController) {
    //todo test change something on screen to see if rememberScaffold...remembers
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
            navController.navigate(route = Screens.Second.route)
        }) {
            Text(text = "Ir a Segunda")
        }
    }
}
