package com.example.firstcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R
import com.example.firstcompose.composable.Header
import com.example.firstcompose.composable.HorizontalSpacer
import com.example.firstcompose.composable.MyButton
import com.example.firstcompose.composable.MyCard
import com.example.firstcompose.composable.MyTextField
import com.example.firstcompose.composable.MyTextFieldGeneric
import com.example.firstcompose.composable.ResizableImage
import com.example.firstcompose.composable.VerticalSpacer

@Composable
fun ProfileScreen() {
    var count by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Title Mohamed", "Body")
        VerticalSpacer(32.dp)
        ResizableImage(painterResource(R.drawable.image), 200)
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.weight(1f)) {
                Header("Title Mohamed", "Body")
            }
            HorizontalSpacer(32.dp)
            Box(modifier = Modifier.weight(1f)) {
                Header("Title Mohamed", "Body")
            }
        }
        VerticalSpacer(32.dp)
        MyCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = cardColors(contentColor = Color.Red)
        ) {
            Header("Title Mohamed", "Body")
        }
        VerticalSpacer(height = 32.dp)
        MyTextField(
            value = count,
            onValueChange = { count = it }
        )
        VerticalSpacer(height = 8.dp)
        MyTextFieldGeneric(
            value = count,
            onValueChange = { count = it }
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            MyButton("اضحك", { count += "😂" })
            HorizontalSpacer(16.dp)
            MyButton("عيط", { count += "😢" })
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    ProfileScreen()
}
