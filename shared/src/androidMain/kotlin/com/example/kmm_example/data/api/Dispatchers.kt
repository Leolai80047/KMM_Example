package com.example.kmm_example.data.api

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val threadIO: CoroutineDispatcher = Dispatchers.IO
actual val threadMain: CoroutineDispatcher = Dispatchers.Main