package com.example.myphoto.data

import com.example.myphoto.common.Constants
import com.example.myphoto.network.KtorHttpClient
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 *Created by jhcheng on 14/5/2022.
 */

class PhotoSource(private val client: HttpClient = KtorHttpClient) {

    suspend fun load() : PhotoWrapper = withContext(Dispatchers.IO) {
        client.getFlickrPhotos().body()
    }
}

private suspend fun HttpClient.getFlickrPhotos() = get(Constants.baseURL) {
    parameter("api_key", "4b7f5c7e3a6132c3bc9a1d0bce5bc9ac")
    parameter("method", "flickr.photos.search")
    parameter("tags", "Electrolux")
    parameter("format", "json")
    parameter("nojsoncallback", "true")
    parameter("extras", "media")
    parameter("extras", "url_sq")
    parameter("extras", "url_m")
    parameter("per_page", "21")
    parameter("page", "1")
}