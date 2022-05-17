package com.example.myphoto.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.myphoto.data.PhotoState
import com.example.myphoto.ui.bar.TopBar

/**
 *Created by jhcheng on 15/5/2022.
 */

@Composable
fun MyPhotoMainScreen(photoState: PhotoState) {
    Scaffold(
        topBar = { TopBar() },
        content = {
            when (photoState) {
                is PhotoState.Loading -> { Loading() }
                is PhotoState.Success -> { PhotoGrid(photoState.photos)  }
                is PhotoState.Error -> { Error(photoState.exception) }
            }
        }
    )
}