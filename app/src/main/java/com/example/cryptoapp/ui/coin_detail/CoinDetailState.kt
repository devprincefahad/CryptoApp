package com.example.cryptoapp.ui.coin_detail

import com.example.cryptoapp.model.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)