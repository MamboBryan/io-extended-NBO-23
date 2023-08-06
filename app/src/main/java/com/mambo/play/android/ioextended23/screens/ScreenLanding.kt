package com.mambo.play.android.ioextended23.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.mambo.play.android.ioextended23.navigation.Routes
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Fri 04 August 2023
 * @time    : 5:58 pm
 */

@Composable
fun ScreenLanding(
    navController: NavController
) {

    val scope = rememberCoroutineScope()

    SideEffect {
        scope.launch {
            delay(3500)
            navController.navigate(Routes.Home.route)
        }
    }

    ScreenLandingContent()

}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
private fun ScreenLandingContent() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Kitawaramba", fontSize = MaterialTheme.typography.displayLarge.fontSize)
            LinearProgressIndicator(modifier = Modifier.padding(vertical = 24.dp))
        }
    }
}