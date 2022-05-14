package com.example.myphoto.viewmodel

import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.myphoto.MyPhotoApplication
import com.example.myphoto.data.PhotoDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 *Created by jhcheng on 14/5/2022.
 */

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val photoRepository = getApplication<MyPhotoApplication>().photoRepository
    private val _photoDetails = mutableStateOf(emptyList<PhotoDetail>())
    val photoDetails: State<List<PhotoDetail>> = _photoDetails

    fun loadPhotos() {
         viewModelScope.launch(Dispatchers.IO) {
             _photoDetails.value = photoRepository.getPhotos()
        }
    }
}