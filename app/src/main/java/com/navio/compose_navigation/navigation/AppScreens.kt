package com.navio.compose_navigation.navigation

//Route which identifies the screen we want to "visit"
sealed class AppScreens(val route: String){
    //We use a sealed class to clearly specify the amount of available screens
    object  FirstScreen: AppScreens("first_screen")
    object  SecondScreen: AppScreens("second_screen")

    //todo Remember to try without the String...
}
