package com.example.firstcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("My App")
            })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) { }
        }
    ) {
        Greeting(
        )
    }
}
