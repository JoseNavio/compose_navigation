package com.navio.compose_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navio.compose_navigation.screens.FirstScreen
import com.navio.compose_navigation.screens.SecondScreen

@Composable
fun AppNavigation(){
    //Propagate this var for each screen in order to know the status of the controller
    val navController = rememberNavController()
    //Contains all possible navigation routes
    NavHost(navController = navController, startDestination = Screens.First.route){
        composable(route = Screens.First.route){
            FirstScreen(navController)
        }
        composable(route = Screens.Second.route){
            SecondScreen(navController)
        }
    }
}