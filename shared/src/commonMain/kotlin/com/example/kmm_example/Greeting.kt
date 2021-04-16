package com.example.kmm_example

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}