package com.example.myphoto.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = ElectroBlue,
    primaryVariant = ElectroBlue400,
    secondary = ElectroBlue400
)

private val LightColorPalette = lightColors(
    primary = ElectroBlue,
    primaryVariant = ElectroBlue400,
    secondary = ElectroBlue400

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MyPhotoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    val colors = LightColorPalette

    // not focusing on dark theme for now
    /*val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }*/

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}