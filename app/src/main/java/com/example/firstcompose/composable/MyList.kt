package com.example.firstcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter

@Composable
fun MyList(dataList: List<String>) {
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(dataList) { imageUrl ->
            ResizableImage(
                painter = rememberAsyncImagePainter(imageUrl),
                size = 200,
                modifier = Modifier
                    .height(200.dp)
                    .padding(end = 8.dp)
            )
        }
    }
}
