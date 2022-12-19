package com.streamliner.cryptocurrencyapp.presentation.coin_detail

import com.streamliner.cryptocurrencyapp.domain.models.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
