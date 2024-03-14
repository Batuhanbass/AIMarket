package com.example.akllmarketaraba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.akllmarketaraba1.ui.theme.AkıllıMarketaraba1Theme
import com.example.akllmarketaraba1.ui.theme.LoginScreen
import com.example.akllmarketaraba1.ui.theme.PasswordResetScreen

import com.example.akllmarketaraba1.ui.theme.RegisterScreen
import com.example.akllmarketaraba1.ui.theme.YanMenu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AkıllıMarketaraba1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Gecis()

                }
            }
        }
    }
}
@Composable
fun Gecis(){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "Anasayfa"){
        composable(route = "Anasayfa"){
            LoginScreen(navController)
        }
        composable(route = "Giris"){
            YanMenu()
        }
        composable(route = "KayıtOl"){
            RegisterScreen()
        }
        composable(route = "SifreSifir"){
                PasswordResetScreen()
        }
    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AkıllıMarketaraba1Theme {
        YanMenu()

    }
}