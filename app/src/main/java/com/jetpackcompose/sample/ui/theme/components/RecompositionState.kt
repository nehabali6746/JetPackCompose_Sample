package com.jetpackcompose.sample.ui.theme.components

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Recomposable(){
    val state= remember {
        mutableStateOf(0.00)
    }
    Log.d("TAGGED","Initial recomposition state")

    Button(onClick = {
        state.value= Math.random()
    }) {
        Log.d("TAGGED"," Logged during both composition and recomposition")
        Text(text = state.value.toString())
    }
}
