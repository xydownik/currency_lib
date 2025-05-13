package com.example.currencylib.data.api

data class ConvertResponse(
    val success: Boolean,
    val query: ConvertQuery,
    val info: ConvertInfo,
    val date: String,
    val result: Double
)

