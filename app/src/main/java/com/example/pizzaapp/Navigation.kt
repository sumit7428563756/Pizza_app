package com.example.pizzaapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigate() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "firstScreen") {
        composable("firstScreen") {
            FirstScreen {
                navController.navigate("homeScreen")
            }
        }
        composable("homeScreen") {
         HomeScreen{
                navController.navigate("firstScreen")
            }
        }

    }
}
