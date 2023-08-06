package com.mambo.play.android.ioextended23.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.tv.material3.Button
import androidx.tv.material3.Carousel
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.mambo.play.android.ioextended23.navigation.Routes

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Fri 04 August 2023
 * @time    : 6:07 pm
 */

@Composable
fun ScreenPhrases(
    navController: NavController
) {
    ScreenPhrasesContent {
        navController.navigate(Routes.Phrase.route)
    }
}

@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
private fun ScreenPhrasesContent(
    onNavigateToWord: () -> Unit
) {

    val list = listOf("Kitakuramba", "Mpoa Wangu", "Ntakufinya", "Sikutambui")

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Carousel(modifier = Modifier.fillMaxSize(), itemCount = 4) { index ->
                Card(modifier = Modifier.fillMaxSize(), onClick = onNavigateToWord) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.padding(16.dp), text = list[index],
                            color = Color.White,
                            fontSize = TextUnit(48f, TextUnitType.Sp)
                        )
                    }
                }
            }
        }
    }
}

