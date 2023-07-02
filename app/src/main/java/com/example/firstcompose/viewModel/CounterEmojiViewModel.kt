package com.example.firstcompose.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class CounterEmojiViewModel : ViewModel() {
    private val _counterState = MutableStateFlow("")
    val counterState: StateFlow<String> = _counterState

    fun onIncreaseSmileCounter() {
        _counterState.update { currentValue ->
            "$currentValue😂"
        }
    }

    fun onIncreaseSadCounter() {
        _counterState.update { currentValue ->
            "$currentValue😢"
        }
    }

    fun onCounterChange(newValue: String) {
        _counterState.value = newValue // Update the counter value
    }
}
