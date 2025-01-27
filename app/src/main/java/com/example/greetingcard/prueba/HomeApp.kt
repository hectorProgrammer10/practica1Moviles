package com.example.greetingcard.prueba

import android.graphics.ColorSpace.Rgb
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import com.example.greetingcard.prueba.components.Barra


@Preview(showBackground = true)
@Preview(showBackground = true)
@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.politecnica_fondo),
            contentDescription = null,
            contentScale = ContentScale.Crop, // Ajusta la imagen para que ocupe toda la pantalla
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
        ) {
            Barra(modifier = Modifier.height(60.dp))
            MostrarAviso()
            // Otros componentes aquí
        }
    }
}


@Composable
fun MostrarAviso(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .border(2.dp, Color.Red)
            .fillMaxWidth()
            .height(200.dp)
            .width(200.dp)
    ) {
        Text(
            text = "solo texto",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}


