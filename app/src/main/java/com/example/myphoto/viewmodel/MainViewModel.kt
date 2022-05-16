package com.example.myphoto.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.myphoto.MyPhotoApplication
import com.example.shared.data.Photo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 *Created by jhcheng on 14/5/2022.
 */

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val photoRepository = getApplication<MyPhotoApplication>().photoRepository
    private val _photos = MutableStateFlow(emptyList<Photo>())
    val photos: StateFlow<List<Photo>> = _photos

    fun loadPhotos() {
         viewModelScope.launch(Dispatchers.IO) {
             _photos.value = photoRepository.getPhotos()
        }
    }
}