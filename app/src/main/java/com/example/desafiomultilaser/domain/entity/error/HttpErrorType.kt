package com.example.desafiomultilaser.domain.entity.error

enum class HttpErrorType {
    UNAUTHORIZED,
    TOO_MANY_REQUESTS;

    companion object {
        fun getErrorForCode(errorCode: Int?): HttpErrorType? {
            return errorCode?.let {
                when (it) {
                    401 -> UNAUTHORIZED
                    409 -> TOO_MANY_REQUESTS
                    else -> null
                }
            }
        }
    }
}