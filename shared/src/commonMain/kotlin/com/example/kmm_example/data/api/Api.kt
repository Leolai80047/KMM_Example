package com.example.kmm_example.data.api

import com.example.kmm_example.data.model.CaptchaResponse
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*

class Api {
    companion object {
        const val CaptchaApi = "https://yaboapi.bbin-asia.com/api-v2/xbb/Captcha"
    }

    private val httpClient = HttpClient {
        install(JsonFeature) {
            val json = kotlinx.serialization.json.Json {
                coerceInputValues = true
                ignoreUnknownKeys = true
            }
            serializer = KotlinxSerializer(json)
        }
    }

    suspend fun getCaptcha(): CaptchaResponse {
        return httpClient.post(CaptchaApi) {
            headers {
                append("x-domain", "500015")
                append(HttpHeaders.ContentType, ContentType.Application.Json)
            }
            body = mapOf(
                "lang" to "zh-cn",
                "format" to "png"
            )
        }
    }

}