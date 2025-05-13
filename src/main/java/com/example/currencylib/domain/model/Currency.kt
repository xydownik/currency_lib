package com.example.currencylib.domain.model

data class Currency(
    val name: String,
    val rate: Double,
    val change24h: Double
)