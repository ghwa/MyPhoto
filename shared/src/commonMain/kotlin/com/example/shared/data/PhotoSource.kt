package com.example.shared.data

import com.example.shared.network.SharedHttpClient
import com.example.shared.common.Constants
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

/**
 *Created by jhcheng on 16/5/2022.
 */

class PhotoSource(private val client: HttpClient = SharedHttpClient) {

    suspend fun getFlickrData() : FlickrDataWrapper = client.get(Constants.baseURL) {
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
    }.body()
}