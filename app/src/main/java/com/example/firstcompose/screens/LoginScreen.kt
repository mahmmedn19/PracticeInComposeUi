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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.firstcompose.R
import com.example.firstcompose.composable.Header
import com.example.firstcompose.composable.HorizontalSpacer
import com.example.firstcompose.composable.MyButton
import com.example.firstcompose.composable.MyCard
import com.example.firstcompose.composable.MyList
import com.example.firstcompose.composable.MyTextFieldGeneric
import com.example.firstcompose.composable.VerticalSpacer
import com.example.firstcompose.viewModel.CounterEmojiViewModel
import kotlin.random.Random

@Composable
fun HomeScreen(viewModel: CounterEmojiViewModel = hiltViewModel()) {
    val counterState by viewModel.counterState.collectAsState()
    CounterContent(
        counter = counterState,
        onSmileClicked = viewModel::onIncreaseSmileCounter,
        onSadClicked = viewModel::onIncreaseSadCounter,
        onCounterChange = viewModel::onCounterChange // Pass the counter change callback
    )
}

@Composable
private fun CounterContent(
    counter: String,
    onSmileClicked: () -> Unit,
    onSadClicked: () -> Unit,
    onCounterChange: (String) -> Unit // New parameter to handle counter changes
) {
    val counterState = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Mohamed Naser", "Android Dev")
        VerticalSpacer(32.dp)
        val randomImageUrls = generateRandomImageUrls(10) // Generate 10 random image URLs

        MyList(dataList = randomImageUrls)

        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.weight(1f)) {
                Header("This For Test", stringResource(R.string.smile))
            }
            HorizontalSpacer(32.dp)
            Box(modifier = Modifier.weight(1f)) {
                Header("This For Test", stringResource(R.string.sad))
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
        MyTextFieldGeneric(
            value = counterState.value,
            onValueChange = {
                counterState.value = it
                onCounterChange(it)
            }
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            MyButton("اضحك", { onSmileClicked() })
            HorizontalSpacer(16.dp)
            MyButton("عيط", { onSadClicked() })
        }
        VerticalSpacer(height = 8.dp)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    HomeScreen()
}

fun generateRandomImageUrls(count: Int): List<String> {
    val baseUrl = "https://picsum.photos"
    /*
        val imageCategories =
            listOf("animals", "nature", "people", "architecture") // Add more categories if needed
        val imageSize = 200 // Specify the desired image size
    */
    val imageUrls = mutableListOf<String>()
    val random = Random.Default

    repeat(count) {
        val width = random.nextInt(800) + 200 // Generate random width between 200 and 1000
        val height = random.nextInt(800) + 200 // Generate random height between 200 and 1000
        /* val categoryIndex = random.nextInt(imageCategories.size)
         val category = imageCategories[categoryIndex]*/
        val imageUrl = "$baseUrl/$width/$height" // Build the image URL
        imageUrls.add(imageUrl)
    }
    return imageUrls
}


