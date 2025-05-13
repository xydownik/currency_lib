package com.example.currencylib.presentation.mapper

import com.example.currencylib.domain.model.Currency
import com.example.currencylib.presentation.CurrencyUi
import java.text.DecimalFormat

object CurrencyUiMapper {
    private val df = DecimalFormat("#.##")

    fun fromDomain(d: Currency): CurrencyUi = CurrencyUi(
        name = d.name,
        rateFormatted = df.format(d.rate),
        change24h = d.change24h
    )
}