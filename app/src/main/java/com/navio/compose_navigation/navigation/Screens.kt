package com.navio.compose_navigation.navigation

sealed class Screens(val route: String) {
    object First : Screens(FIRST_SCREEN)
    object Second : Screens(SECOND_SCREEN)

    companion object {
        private const val FIRST_SCREEN = "first_screen"
        private const val SECOND_SCREEN = "second_screen"
    }
}
