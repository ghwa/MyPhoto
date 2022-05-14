package com.example.myphoto

import android.app.Application
import com.example.myphoto.data.PhotoRepository

/**
 *Created by jhcheng on 14/5/2022.
 */

class MyPhotoApplication : Application() {

    val photoRepository by lazy { PhotoRepository() }
}