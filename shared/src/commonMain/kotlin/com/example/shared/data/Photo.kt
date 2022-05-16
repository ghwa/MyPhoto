package com.example.shared.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *Created by jhcheng on 16/5/2022.
 */

@Serializable
data class FlickrDataWrapper(
    @SerialName("photos")
    val flickrData: FlickrData
)

@Serializable
data class FlickrData(
    val page: Int = 0,
    val pages: Int = 0,
    @SerialName("photo")
    val photos: List<Photo> = emptyList()
)

@Serializable
data class Photo(
    val id: String = "",
    val title: String = "",
    @SerialName("url_m")
    val url: String = ""
)