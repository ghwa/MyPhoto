package com.example.myphoto.data

import com.example.shared.data.Photo
import com.example.shared.data.PhotoSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 *Created by jhcheng on 14/5/2022.
 */

class PhotoRepository(private val photoSource: PhotoSource = PhotoSource()) {

    suspend fun getPhotos() : List<Photo> {

        // run network call outside of main thread
        return withContext(Dispatchers.IO) {
            photoSource.getFlickrData().flickrData.photos
        }
    }
}