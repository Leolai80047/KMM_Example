package com.example.kmm_example.domain

import com.example.kmm_example.data.api.Api
import com.example.kmm_example.data.model.CaptchaResponse
import com.example.kmm_example.data.repo.CaptchaRepository

class GetCaptchaUseCase(private val repo: CaptchaRepository) {
    companion object {
        fun getCase(): GetCaptchaUseCase {
            return GetCaptchaUseCase(CaptchaRepository(Api()))
        }
    }

    operator suspend fun invoke(): CaptchaResponse {
        return repo.getCaptcha()
    }
}