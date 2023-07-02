package com.example.firstcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.Roboto

@Composable
fun Header(title: String, body: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            color = Color.Blue,
            style = MaterialTheme.typography.bodyLarge,
        )
        Text(
            text = body,
            color = Color.Blue,
            fontFamily = Roboto,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    Header("mo", "naser")
}