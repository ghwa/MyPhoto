package com.example.myphoto.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.myphoto.data.PhotoDetail
import com.example.myphoto.ui.bar.TopBar

/**
 *Created by jhcheng on 15/5/2022.
 */

@Composable
fun MyPhotoMainScreen(photoDetails: List<PhotoDetail>) {
    Scaffold(
        topBar = { TopBar() },
        content = { PhotoGrid(photoDetails) }
    )
}