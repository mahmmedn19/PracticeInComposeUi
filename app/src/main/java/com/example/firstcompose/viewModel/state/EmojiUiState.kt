package com.example.firstcompose.viewModel.state

data class EmojiUiState(
    val emoji:String = "",
)
data class TextUiStates(
    val name:List<TextUiState> = emptyList()
)
data class TextUiState(
    val textName:String = "",
)

