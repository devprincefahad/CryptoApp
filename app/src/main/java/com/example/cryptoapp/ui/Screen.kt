package com.example.cryptoapp.ui

sealed class Screen(val route:String){
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
