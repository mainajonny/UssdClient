package com.epitome.nashussd.interfaces

import com.epitome.nashussd.data.USSDPayload

interface USSDExecutor {
    fun execute(ussd: USSDPayload, callback: UssdCallback)
    fun onResponse(result: String?)
    fun onComplete(result: String?)
    fun onError(result: String?)
}