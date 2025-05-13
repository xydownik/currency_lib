package com.example.currencylib.domain.repository

import com.example.currencylib.domain.model.Currency

interface CurrencyRepository {
    suspend fun getCurrencies(base: String = "EUR"): List<Currency>
    suspend fun convert(
        from: String,
        to: String,
        amount: Double
    ): Double
}