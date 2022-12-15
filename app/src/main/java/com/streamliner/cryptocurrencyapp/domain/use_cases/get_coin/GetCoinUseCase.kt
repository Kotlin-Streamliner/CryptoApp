package com.streamliner.cryptocurrencyapp.domain.use_cases.get_coin

import com.streamliner.cryptocurrencyapp.common.Resource
import com.streamliner.cryptocurrencyapp.data.remote.dto.toCoin
import com.streamliner.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.streamliner.cryptocurrencyapp.domain.models.Coin
import com.streamliner.cryptocurrencyapp.domain.models.CoinDetail
import com.streamliner.cryptocurrencyapp.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}