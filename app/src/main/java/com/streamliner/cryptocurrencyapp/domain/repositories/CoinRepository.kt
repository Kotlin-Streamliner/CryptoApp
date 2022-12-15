package com.streamliner.cryptocurrencyapp.domain.repositories

import com.streamliner.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.streamliner.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}