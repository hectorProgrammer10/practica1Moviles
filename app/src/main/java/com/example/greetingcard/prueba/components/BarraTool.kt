package com.example.greetingcard.prueba.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Barra(modifier: Modifier){
    Box (modifier = modifier
        .fillMaxWidth()
        .background(Color(red = 100, green = 100, blue = 100)),

        ) {
        Row (
            modifier = modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,

            ){
            Box(
                modifier = modifier
                    .width(50.dp)
            ){
                Text(
                    modifier = modifier
                    ,
                    text = "=",
                    fontSize = 25.sp,
                    color = Color.White
                )
            }
            Text(
                modifier = modifier
                    .width(250.dp),
                //.border(2.dp, Color.Red),
                text = "4ta FERIA DE EMPRENDIMIENTO E INNOVACIÓN SOCIAL",
                fontSize = 15.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Box(
                modifier = modifier
                    .width(50.dp)
            ){
                Text(
                    modifier = modifier
                    ,
                    text = "Salir ->",
                    fontSize = 15.sp,
                    color = Color.White
                )
            }
        }

    }
}