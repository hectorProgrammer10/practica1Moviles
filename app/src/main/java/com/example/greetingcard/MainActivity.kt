package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.demo.HomeViewModel
import com.example.greetingcard.demo.MyView
import com.example.greetingcard.ui.theme.GreetingCardTheme
import com.example.greetingcard.prueba.App
import com.example.greetingcard.register.presentation.RegisterScreen
import com.example.greetingcard.register.presentation.RegisterViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge ()
        setContent {
            GreetingCardTheme {
                //MyView(homeViewModel =  HomeViewModel())
                //App()
                RegisterScreen(RegisterViewModel())
            }

        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .border(2.dp, Color.Red, RoundedCornerShape(8.dp))
//                .padding(vertical = 30.dp),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Head()
//            Body ()
//            Footer ()
//        }
//    }
//}
//
//@Composable
//fun Head() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(2.dp, Color.Red)
//            .height(60.dp),
//        contentAlignment = Alignment.Center
//    ) { Text(text = "head") }
//}
//
//@Composable
//fun Body() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(2.dp, Color.Red)
//            .height(700.dp),
//        contentAlignment = Alignment.Center
//    ) { Text(text = "body2") }
//}
//
//@Composable
//fun Footer() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(2.dp, Color.Red)
//            .height(60.dp),
//        contentAlignment = Alignment.Center
//    ) { Text(text = "footer") }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    GreetingCardTheme { Greeting("Héctor") }
//}