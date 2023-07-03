package com.example.firstcompose.screens

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.firstcompose.viewModel.TextViewModel
import com.example.firstcompose.viewModel.state.TextUiState
import com.example.firstcompose.viewModel.state.TextUiStates

@Composable
fun TextScreen(
    textViewModel: TextViewModel = hiltViewModel()
) {
    val textState by textViewModel.textState.collectAsState()
    TextContent(
        state = textState,
        onClick = textViewModel::onClickText
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun TextContent(
    state: TextUiStates,
    onClick: (TextUiState) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        //this for horizontal
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement  = Arrangement.spacedBy(16.dp)
            ){
                items(state.name.size,
                key = {
                    it
                }) {
                    val backgroundColor = if (it % 2 == 0) Color.Blue else Color.Red
                    Text(
                        text = state.name[it].textName,
                        fontSize = 24.sp,
                        modifier = Modifier
                            .background(backgroundColor, RectangleShape).clickable {
                                onClick(state.name[it])
                            }.animateItemPlacement()
                    )
                }
            }
        }


        //this for vertical
        items(state.name.size) {
            val backgroundColor = if (it % 2 == 0) Color.Blue else Color.Red
            Text(
                text = state.name[it].textName,
                fontSize = 24.sp,
                modifier = Modifier
                    .background(backgroundColor, RectangleShape).clickable {
                        onClick(state.name[it])
                    }
            )
        }
    }
}