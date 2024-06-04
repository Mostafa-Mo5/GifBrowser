package com.example.gifbrowserapp.data.entities.categories


import com.google.gson.annotations.SerializedName

data class DownsizedMedium(
    @SerializedName("height")
    val height: String?,
    @SerializedName("size")
    val size: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: String?
)