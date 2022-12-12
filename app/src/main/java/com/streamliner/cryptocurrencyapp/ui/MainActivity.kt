package com.streamliner.cryptocurrencyapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.streamliner.cryptocurrencyapp.ui.theme.CryptoCurrencyAppTheme

class MainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CryptoCurrencyAppTheme {
                Surface(color = MaterialTheme.colors.background) {}
            }
        }
    }
}