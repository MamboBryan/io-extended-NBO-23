package com.mambo.play.android.ioextended23.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mambo.play.android.ioextended23.screens.ScreenHome
import com.mambo.play.android.ioextended23.screens.ScreenLanding
import com.mambo.play.android.ioextended23.screens.ScreenPhrase
import com.mambo.play.android.ioextended23.screens.ScreenPhrases

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Fri 04 August 2023
 * @time    : 6:05 pm
 */
@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Landing.route) {
        composable(Routes.Landing.route) { ScreenLanding(navController = navController) }
        composable(Routes.Phrases.route) { ScreenPhrases(navController = navController) }
        composable(Routes.Phrase.route) { ScreenPhrase(navController = navController) }
        composable(Routes.Home.route) { ScreenHome(navController = navController) }
    }
}