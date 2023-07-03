package com.example.firstcompose.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.composable.CustomButton
import com.example.firstcompose.composable.HorizontalSpacer
import com.example.firstcompose.composable.ReusableCard

@Composable
fun GameScreen() {
    Row {
        ReusableCard(
            modifier = Modifier,
            labelText = "CORRECT",
            questionCount = "7 Questions",
            imageVector = Icons.Default.PlayCircle
        )
        HorizontalSpacer(width = 12.dp)
        ReusableCard(
            modifier = Modifier,
            labelText = "COMPLETION",
            questionCount = "7 Questions",
            imageVector = Icons.Default.PlayCircle
        )
    }
    Row {
        ReusableCard(
            modifier = Modifier,
            labelText = "SKIPPED",
            questionCount = "7 Questions",
            imageVector = Icons.Default.PlayCircle
        )
        HorizontalSpacer(width = 12.dp)
        ReusableCard(
            modifier = Modifier,
            labelText = "INCORRECT",
            questionCount = "7 Questions",
            imageVector = Icons.Default.PlayCircle
        )
    }
    Row {
        CustomButton(text = "Play again", onClick = {
            //TODO PLAY AGAIN
        })
        HorizontalSpacer(width = 16.dp)
        CustomButton(text = "Home", onClick = {
            //TODO PLAY AGAIN
        })
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewGameScreen() {
    GameScreen()
}