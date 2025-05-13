package com.example.currencylib.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface ExchangeApi {
    @GET("symbols")
    suspend fun getSymbols(
        @Query("access_key") key: String
    ): SymbolsResponse

    @GET("latest")
    suspend fun getLatest(
        @Query("access_key") key: String,
        @Query("base") base: String
    ): LatestResponse

    @GET("convert")
    suspend fun convert(
        @Query("access_key") key: String,
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Double
    ): ConvertResponse
}