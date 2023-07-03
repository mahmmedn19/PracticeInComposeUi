package com.example.firstcompose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ReusableCard(
    modifier: Modifier = Modifier,
    labelText: String,
    questionCount: String,
    imageVector: ImageVector
) {
    StatusCard(
        modifier = modifier
            .width(158.dp)
            .height(70.dp),
        0,
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .background(color = Color(0xFF6F2F7B), shape = RoundedCornerShape(size = 8.dp)),
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomIcon(imageVector = imageVector)
                Text(
                    text = labelText,
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Text(
                text = questionCount,
                fontSize = 14.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

@Composable
fun CustomIcon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    contentDescription: String? = null,
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier.size(6.dp),
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint
    )
}

@Composable
fun StatusCard(
    modifier: Modifier = Modifier,
    elevation: Int,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = elevation.dp),
    ) {
        content()
    }
}

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .width(156.dp)
            .height(54.dp)
            .background(color = Color(0xFFC8C4F0), shape = RoundedCornerShape(size = 16.dp)),
        onClick = onClick,
    ) {
        Text(text = text)
    }
}