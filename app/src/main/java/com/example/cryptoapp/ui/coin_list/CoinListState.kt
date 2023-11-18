package com.example.cryptoapp.ui.coin_list

import com.example.cryptoapp.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)