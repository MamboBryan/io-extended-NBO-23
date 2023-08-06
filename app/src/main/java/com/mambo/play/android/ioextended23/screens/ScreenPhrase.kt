package com.mambo.play.android.ioextended23.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.tv.material3.Button
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import androidx.tv.material3.Text

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Fri 04 August 2023
 * @time    : 7:03 pm
 */

@Composable
fun ScreenPhrase(navController: NavController) {
    ScreenPhraseContent { navController.popBackStack() }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun ScreenPhraseContent(onNavigateBack: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Word")
            Button(modifier = Modifier.padding(vertical = 16.dp), onClick = onNavigateBack) {
                Text(text = "back")
            }
        }
    }
}