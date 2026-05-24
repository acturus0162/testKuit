package com.example.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.core.Greeter

@Composable
fun HomeScreen(modifier: Modifier= Modifier, name:String){
    Column(modifier=modifier.fillMaxSize()){
        Text(
            Greeter.hello(name)
        )
    }
}