package com.example.myphoto.data

import com.example.shared.data.Photo

/**
 *Created by jhcheng on 16/5/2022.
 */

sealed class PhotoState {
    object Loading : PhotoState()
    data class Success(val photos: List<Photo>) : PhotoState()
    data class Error(val exception: String) : PhotoState()
}
