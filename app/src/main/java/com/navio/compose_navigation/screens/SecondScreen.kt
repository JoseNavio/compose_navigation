package com.navio.compose_navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.navio.compose_navigation.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(topBar = {
              TopAppBar {
                  Icon(imageVector = Icons.Default.ArrowBack,
                      contentDescription = "Ir atrás",
                      modifier = Modifier.clickable {
                          navController.popBackStack()
                      })
                  Text(text = "Segunda pantalla")
              }
    }, content = { padding ->
        SecondContent(
            padding, navController
        )
    })
}

@Composable
fun SecondContent(paddingValues: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Segunda")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Volver")
        }
    }
}

