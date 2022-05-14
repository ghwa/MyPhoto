package com.example.myphoto.network

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.engine.cio.*
import io.ktor.serialization.gson.*

/**
 *Created by jhcheng on 14/5/2022.
 */


val KtorHttpClient: HttpClient by lazy {
    HttpClient(CIO) {
        install(ContentNegotiation) {
            gson()
        }
    }
}