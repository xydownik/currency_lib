package com.example.currencylib.presentation

data class CurrencyUi(
    val name: String,
    val rateFormatted: String,
    val change24h: Double
)