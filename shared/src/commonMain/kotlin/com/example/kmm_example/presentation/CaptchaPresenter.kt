package com.example.kmm_example.presentation

import com.example.kmm_example.data.api.threadIO
import com.example.kmm_example.data.api.threadMain
import com.example.kmm_example.domain.GetCaptchaUseCase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CaptchaPresenter(private val view: CaptchaView) {

    private val getCaptchaUseCase = GetCaptchaUseCase.getCase()

    interface CaptchaView {
        fun show(str: String)
    }

    fun start() {
        GlobalScope.apply {
            launch(threadIO) {

                val data = getCaptchaUseCase()

                withContext(threadMain) {
                    view.show(data.toString())
                }
            }
        }
    }

}