package com.example.cryptoapp.model

import com.google.gson.annotations.SerializedName

data class Whitepaper(
    @SerializedName("link")
    var link: String,
    @SerializedName("thumbnail")
    var thumbnail: String
)