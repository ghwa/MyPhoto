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
import com.example.myphoto.data.PhotoDetail
import com.example.myphoto.ui.theme.Gray200
import com.skydoves.landscapist.glide.GlideImage

/**
 *Created by jhcheng on 15/5/2022.
 */

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGrid(photoDetails: List<PhotoDetail>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(photoDetails) { photoDetail ->
            PhotoItem(imageUrl = photoDetail.url_m)
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