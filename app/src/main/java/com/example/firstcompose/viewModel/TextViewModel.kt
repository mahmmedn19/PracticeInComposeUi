package com.example.firstcompose.viewModel

import androidx.lifecycle.ViewModel
import com.example.firstcompose.viewModel.state.TextUiState
import com.example.firstcompose.viewModel.state.TextUiStates
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class TextViewModel : ViewModel() {
    private val _textState = MutableStateFlow(TextUiStates())
    val textState = _textState.asStateFlow()

    init {
        getText()
    }

    private fun getText() {
        _textState.update {
            it.copy(
                name = listOf(
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("mohamed"),
                    TextUiState("naser"),
                    TextUiState("naser"),
                    TextUiState("naser"),
                    TextUiState("naser"),
                    TextUiState("naser"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salah"),
                    TextUiState("salسثضثضثah"),
                    TextUiState("salءah"),
                    TextUiState("salثah"),
                    TextUiState("salصثah"),
                    TextUiState("mohليسamed"),
                    TextUiState("mohسيليamed"),
                    TextUiState("mohيسلسيamed"),
                    TextUiState("mohamed"),
                )
            )
        }
    }
    fun onClickText(text: TextUiState) {
        _textState.update {
            it.copy( name = it.name.filterNot {
                it.textName == text.textName
            })
        }
    }
}


