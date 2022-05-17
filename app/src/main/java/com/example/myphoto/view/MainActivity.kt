package com.example.myphoto.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.myphoto.ui.MyPhotoMainScreen
import com.example.myphoto.ui.theme.MyPhotoTheme
import com.example.myphoto.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val photoState by viewModel.photos.collectAsState()

            MyPhotoTheme {
                MyPhotoMainScreen(photoState = photoState)
            }
        }
    }
}

