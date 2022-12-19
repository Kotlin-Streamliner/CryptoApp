package com.streamliner.cryptocurrencyapp.presentation.coin_list

import com.streamliner.cryptocurrencyapp.domain.models.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
