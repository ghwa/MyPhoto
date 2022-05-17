package com.example.myphoto.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.myphoto.MyPhotoApplication
import com.example.myphoto.data.PhotoState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 *Created by jhcheng on 14/5/2022.
 */

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val photoRepository = getApplication<MyPhotoApplication>().photoRepository
    private val _photos = MutableStateFlow<PhotoState>(PhotoState.Loading)
    val photos: StateFlow<PhotoState> = _photos

    init {
        loadPhotos()
    }

    private fun loadPhotos() {
        // run network call outside of main thread
         viewModelScope.launch(Dispatchers.IO) {
             _photos.value = photoRepository.getPhotos()
        }
    }
}