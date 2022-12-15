package com.streamliner.cryptocurrencyapp.data.repositories

import com.streamliner.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.streamliner.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.streamliner.cryptocurrencyapp.data.remote.dto.CoinDto
import com.streamliner.cryptocurrencyapp.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}