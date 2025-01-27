package com.example.greetingcard.navigator
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greetingcard.login.presentation.LoginScreen
import com.example.greetingcard.register.presentation.RegisterScreen
import com.example.greetingcard.register.presentation.RegisterViewModel
import com.example.greetingcard.login.presentation.LoginViewModel
@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(loginViewModel = LoginViewModel(), navController = navController)
        }
        composable("register") {
            RegisterScreen(navController = navController, registerViewModel = RegisterViewModel())
        }

    }
}