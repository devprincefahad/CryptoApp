package com.example.cryptoapp.use_case.get_coins

import com.example.cryptoapp.common.Resource
import com.example.cryptoapp.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import com.example.cryptoapp.model.Coin
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {

        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { coin ->
                Coin(
                    id = coin.id,
                    isActive = coin.isActive,
                    isNew = coin.isNew,
                    name = coin.name,
                    rank = coin.rank,
                    symbol = coin.symbol,
                    type = coin.type
                )
            }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured."))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}