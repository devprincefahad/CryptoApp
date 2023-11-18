package com.example.cryptoapp.repository

import com.example.cryptoapp.model.Coin
import com.example.cryptoapp.model.CoinDetail
import com.example.cryptoapp.remote.CoinPaprikaApi
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins();
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoinById(coinId)
    }

}