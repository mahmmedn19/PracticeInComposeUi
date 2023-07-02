package com.example.firstcompose.composable

import android.graphics.fonts.FontFamily
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun MyText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = 16.sp,
    textAlign: TextAlign? = null
) {
    Text(
        modifier = modifier,
        text = text,
        color = color,
        fontSize = fontSize,
        textAlign = textAlign
    )
}
