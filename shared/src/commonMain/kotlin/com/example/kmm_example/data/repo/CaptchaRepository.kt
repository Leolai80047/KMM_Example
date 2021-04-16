package com.example.kmm_example.data.repo

import com.example.kmm_example.data.api.Api
import com.example.kmm_example.data.model.CaptchaResponse

class CaptchaRepository(private val api: Api) {
    suspend fun getCaptcha(): CaptchaResponse {
        return api.getCaptcha()
    }
}