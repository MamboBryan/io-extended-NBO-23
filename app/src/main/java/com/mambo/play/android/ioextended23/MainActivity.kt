package com.mambo.play.android.ioextended23

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mambo.play.android.ioextended23.navigation.MainNavigation
import com.mambo.play.android.ioextended23.ui.theme.IoExtended23Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IoExtended23Theme {
                MainNavigation()
            }
        }
    }
}
