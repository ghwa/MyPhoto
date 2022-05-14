package com.example.myphoto.data

/**
 *Created by jhcheng on 14/5/2022.
 */

class PhotoRepository(private val photoSource: PhotoSource = PhotoSource()) {

    suspend fun getPhotos() : List<PhotoDetail> {
        return photoSource.load().photos.photo
    }
}