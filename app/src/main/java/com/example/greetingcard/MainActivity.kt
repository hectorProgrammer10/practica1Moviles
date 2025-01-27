package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.greetingcard.ui.theme.GreetingCardTheme
import com.example.greetingcard.navigator.AppNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge ()
        setContent {
            GreetingCardTheme {
                //MyView(homeViewModel =  HomeViewModel())
                //App()
                AppNavigator()
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