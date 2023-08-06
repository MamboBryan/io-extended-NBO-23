package com.mambo.play.android.ioextended23.navigation

/**
 * @project : IoExtended23
 * @author  : mambo
 * @email   : mambobryan@gmail.com
 * @date    : Fri 04 August 2023
 * @time    : 6:05 pm
 */
sealed class Routes(val route: String) {
    object Home : Routes(route = "home")
    object Landing : Routes(route = "landing")
    object Phrases : Routes(route = "phrases")
    object Phrase : Routes(route = "phrase")
}