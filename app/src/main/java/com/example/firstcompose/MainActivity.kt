package com.example.firstcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Mohamed Naser",
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif,
            fontSize = 32.sp,
            modifier = Modifier.background(Color.Transparent)
                .fillMaxSize()
                .border(2.dp, Color.Black) // outer border
                .background(Color.Cyan)
                .padding(8.dp) // space between the borders
                .border(2.dp, Color.Green) // inner border
                .padding(8.dp) // padding
                .background(Color.Blue)
        )
        Text(
            "Mohamed Naser",
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif,
            fontSize = 32.sp,
            modifier = Modifier.background(Color.Transparent)
        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewMessage(){
    Greeting()
}
