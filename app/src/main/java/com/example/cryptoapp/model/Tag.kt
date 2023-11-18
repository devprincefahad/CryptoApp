package com.example.cryptoapp.model

import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("coin_counter")
    var coinCounter: Int,
    @SerializedName("ico_counter")
    var icoCounter: Int
)