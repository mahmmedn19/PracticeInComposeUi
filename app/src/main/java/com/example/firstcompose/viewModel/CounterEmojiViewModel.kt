package com.example.firstcompose.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.firstcompose.viewModel.state.EmojiUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class CounterEmojiViewModel : ViewModel() {
    private val _counterState = MutableStateFlow(0)
    val counterState =  _counterState.asStateFlow()

    private val _emojiState = MutableStateFlow(EmojiUiState())
    val emojiState =  _emojiState.asStateFlow()
    fun onIncreaseSmileCounter() {
        _counterState.update { currentValue ->
           // "$currentValue😂"
            currentValue + 1
        }
    }

    fun onIncreaseSadCounter() {
        _counterState.update { currentValue ->
            //"$currentValue😢"
            currentValue-1
        }
    }

    fun onCounterEmojiChange(newValue: String) {
        _emojiState.update { it.copy(emoji = newValue) }
    }
    fun smileEmoji(){

    }
    fun sadEmoji(){

    }
}
