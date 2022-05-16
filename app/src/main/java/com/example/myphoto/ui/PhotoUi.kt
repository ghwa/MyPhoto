package com.example.myphoto.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.myphoto.ui.theme.Gray200
import com.example.shared.data.Photo
import com.skydoves.landscapist.glide.GlideImage

/**
 *Created by jhcheng on 15/5/2022.
 */

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGrid(photos: List<Photo>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(photos) { photo ->
            PhotoItem(imageUrl = photo.url)
        }
    }
}

@Composable
private fun PhotoItem(imageUrl: String) {
    GlideImage(
        imageModel = imageUrl,
        contentScale = ContentScale.None,
        modifier = Modifier
            .padding(all = 4.dp)
            .size(100.dp)
            .background(color = Gray200)
    )
}