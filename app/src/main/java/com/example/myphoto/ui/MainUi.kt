package com.example.myphoto.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.myphoto.ui.bar.TopBar
import com.example.shared.data.Photo

/**
 *Created by jhcheng on 15/5/2022.
 */

@Composable
fun MyPhotoMainScreen(photos: List<Photo>) {
    Scaffold(
        topBar = { TopBar() },
        content = { PhotoGrid(photos) }
    )
}