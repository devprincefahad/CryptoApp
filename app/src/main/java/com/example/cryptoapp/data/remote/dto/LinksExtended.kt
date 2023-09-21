package com.example.cryptoapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("url")
    var url: String,
    @SerializedName("type")
    var type: String
)