package com.example.kmm_example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmm_example.Greeting
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.kmm_example.domain.GetCaptchaUseCase
import com.example.kmm_example.presentation.CaptchaPresenter
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity(), CaptchaPresenter.CaptchaView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val presenter = CaptchaPresenter(this)
        presenter.start()

    }

    override fun show(str: String) {
        val tv = findViewById<TextView>(R.id.text_view)
        tv.text = str
    }
}
