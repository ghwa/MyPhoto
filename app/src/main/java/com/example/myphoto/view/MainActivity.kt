package com.example.myphoto.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myphoto.data.PhotoDetail
import com.example.myphoto.ui.theme.MyPhotoTheme
import com.example.myphoto.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.loadPhotos()

        setContent {
            val photoDetails by viewModel.photoDetails

            MyPhotoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    URLList(photoDetails)
                }
            }
        }
    }
}

@Composable
fun URLList(photoDetails: List<PhotoDetail>) {
    LazyColumn {
        items(photoDetails) { photoDetail ->
            Text(text = photoDetail.url_m)
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyPhotoTheme {
        Greeting("Android")
    }
}