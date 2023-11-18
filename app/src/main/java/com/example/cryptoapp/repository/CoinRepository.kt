package com.example.cryptoapp.repository
import com.example.cryptoapp.model.Coin
import com.example.cryptoapp.model.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetail

}