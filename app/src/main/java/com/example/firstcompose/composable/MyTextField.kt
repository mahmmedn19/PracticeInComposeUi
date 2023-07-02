package com.example.firstcompose.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun MyTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
    )
}

@Composable
fun <T> MyTextFieldGeneric(
    value: T,
    onValueChange: (T) -> Unit,
    modifier: Modifier = Modifier,
) {
    TextField(
        value = TextFieldValue(value.toString()),
        onValueChange = {
            @Suppress("UNCHECKED_CAST")
            onValueChange(it.text as T)
        },
        modifier = modifier.fillMaxWidth(),
    )
}