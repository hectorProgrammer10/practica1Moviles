package com.example.greetingcard.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true)
@Composable
fun MyView(homeViewModel: HomeViewModel){
    val number:Int by homeViewModel.number.observeAsState(initial = 0)
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        viewTop(Modifier.weight(1f)){homeViewModel.onChangeNumber()}
        viewCenter(Modifier.weight(1f), onClick = {homeViewModel.onChangeNumber()})
        viewBOttom(Modifier.weight(1f), number)
    }

}
@Composable
fun  viewTop(modifier: Modifier, onClick: ()->Unit){
    Box(
        modifier=modifier
            .background(Color.Blue)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center

    ){
        Button(
            onClick = {onClick()},
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Click",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun viewCenter(modifier: Modifier, onClick: () -> Unit){
    Box(
        modifier=modifier
            .fillMaxWidth()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ){
        Button(
            onClick = {onClick()},
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Click",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun viewBOttom(modifier: Modifier, count:Int){
    Box(
        modifier=modifier
            .fillMaxWidth()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Total de clicks: ${count}",
            fontSize = 25.sp
        )
    }
}