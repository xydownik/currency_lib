package com.example.currencylib.data.mapper

import com.example.currencylib.data.api.LatestResponse
import com.example.currencylib.domain.model.Currency

object CurrencyDtoMapper {
    fun fromLatest(response: LatestResponse): List<Currency> =
        response.rates.map { (code, rate) ->
            Currency(
                name = code,
                rate = rate,
                change24h = 0.0 // пока нет /fluctuation, можно заменить
            )
        }
}