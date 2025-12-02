package com.fahmi.prak7

import android.media.Image
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Book(
    val title: String?,
    @SerializedName("releaseDate")
    val releaseDate: String?,
    val cover: String?,
    val pages: Int?,
    @SerializedName("description")
    val description: String?
) : Serializable