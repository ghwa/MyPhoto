package com.example.myphoto.data

import com.example.shared.data.FlickrDataWrapper
import com.example.shared.data.PhotoSource
import io.ktor.client.call.*

/**
 *Created by jhcheng on 14/5/2022.
 */

class PhotoRepository(private val photoSource: PhotoSource = PhotoSource()) {

    suspend fun getPhotos() : PhotoState {
        val httpResponse = photoSource.getFlickrData()

        return when (httpResponse.status.value) {
            in 200..299 -> {
                PhotoState.Success(httpResponse.body<FlickrDataWrapper>().flickrData.photos)
            }
            else -> {
                PhotoState.Error(httpResponse.status.description)
            }
        }
    }
}