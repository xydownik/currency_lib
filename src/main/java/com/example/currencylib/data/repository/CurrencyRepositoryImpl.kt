package com.example.currencylib.data.repository

import com.example.currencylib.data.api.ExchangeApi
import com.example.currencylib.data.mapper.CurrencyDtoMapper
import com.example.currencylib.domain.model.Currency
import com.example.currencylib.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl(
    private val api: ExchangeApi,
    private val apiKey: String
) : CurrencyRepository {
    override suspend fun getCurrencies(base: String): List<Currency> {
        val resp = api.getLatest(key = apiKey, base = base)
        require(resp.success) { "API error when fetching rates" }
        return CurrencyDtoMapper.fromLatest(resp)
    }

    override suspend fun convert(
        from: String,
        to: String,
        amount: Double
    ): Double {
        val resp = api.convert(
            key = apiKey,
            from = from,
            to = to,
            amount = amount
        )
        require(resp.success) { "API error on convert" }
        return resp.result
    }
}