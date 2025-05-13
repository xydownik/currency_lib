package com.example.currencylib.domain.usecase

import com.example.currencylib.domain.repository.CurrencyRepository

class ConvertCurrencyUseCase(
    private val repo: CurrencyRepository
) {
    suspend operator fun invoke(
        from: String,
        to: String,
        amount: Double
    ): Double = repo.convert(from, to, amount)
}