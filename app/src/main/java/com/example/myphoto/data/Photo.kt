package com.example.myphoto.data

/**
 *Created by jhcheng on 14/5/2022.
 */

data class PhotoWrapper(val photos: Photo)

data class Photo(
    val page: Int = 0,
    val pages: Int = 0,
    val photo: List<PhotoDetail> = emptyList()
)

data class PhotoDetail(
    val id: String = "",
    val title: String = "",
    val url_m: String = ""
)
