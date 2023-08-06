package com.mambo.play.android.ioextended23.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import androidx.tv.material3.Card
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Tab
import androidx.tv.material3.TabRow
import androidx.tv.material3.Text

import com.mambo.play.android.ioextended23.navigation.Routes

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Sat 05 August 2023
 * @time    : 1:03 am
 */

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun ScreenHome(
    navController: NavController
) {

    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("phrases", "words", "villagers")

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TabRow(
                selectedTabIndex = selectedTab,
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onFocus = {
                            selectedTab = index
                        }
                    ) {
                        Text(
                            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp),
                            text = title
                        )
                    }
                }
            }

            AnimatedContent(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                targetState = selectedTab,
                label = ""
            ) { value ->
                when (value) {
                    0 -> PhrasesScreen { navController.navigate(Routes.Phrases.route) }
                    1 -> WordsScreen()
                    else -> VillagersScreen()
                }
            }

        }
    }

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
private fun PhrasesScreen(onClick: () -> Unit) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(modifier = Modifier.fillMaxSize(), onClick = onClick) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "\uD83D\uDE0A \uD83D\uDE0F \uD83D\uDE09",
                    fontSize = TextUnit(88f, TextUnitType.Sp)
                )
                Text(
                    modifier = Modifier.padding(top = 16.dp),
                    text = "phrases",
                    fontSize = TextUnit(24f, TextUnitType.Sp)
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalTvMaterial3Api::class)
@Composable
private fun WordsScreen() {
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Card(modifier = Modifier.fillMaxSize(), onClick = {
            Toast.makeText(context, "Phrases clicked", Toast.LENGTH_LONG).show()
        }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "\uD83E\uDEE3 \uD83E\uDD71 \uD83E\uDD2D",
                    fontSize = TextUnit(88f, TextUnitType.Sp)
                )
                Text(
                    modifier = Modifier.padding(top = 16.dp),
                    text = "words",
                    fontSize = TextUnit(24f, TextUnitType.Sp)
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalTvMaterial3Api::class)
@Composable
private fun VillagersScreen() {
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Card(modifier = Modifier.fillMaxSize(), onClick = {
            Toast.makeText(context, "Villagers clicked", Toast.LENGTH_LONG).show()
        }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "\uD83E\uDDD0 \uD83E\uDD13 \uD83D\uDE0E \uD83E\uDD78",
                    fontSize = TextUnit(88f, TextUnitType.Sp)
                )
                Text(
                    modifier = Modifier.padding(top = 16.dp),
                    text = "Villagers",
                    fontSize = TextUnit(24f, TextUnitType.Sp)
                )
            }
        }
    }
}
