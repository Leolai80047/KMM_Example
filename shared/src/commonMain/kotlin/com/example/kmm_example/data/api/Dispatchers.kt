package com.example.kmm_example.data.api

import kotlinx.coroutines.CoroutineDispatcher

expect val threadIO: CoroutineDispatcher
expect val threadMain: CoroutineDispatcher