package com.example.kmm_example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CaptchaResponse(
    val data: CaptchaData? = null,
    val status: String,
    val errorCode: String,
    val msg: String? = null
) {
    @Serializable
    data class CaptchaData(
        var cookie: CaptchaCookie? = null,
        var data: String? = null
    ){
        @Serializable
        data class CaptchaCookie(
            var aid: String? = null
        )
    }
}