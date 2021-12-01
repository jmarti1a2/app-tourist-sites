package com.jmarti.proyectosemtres.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PointinterestItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("occupation")
    val occupation: String,
    @SerializedName("urlPicture")
    val urlPicture: String,
    @SerializedName("place")
    val place: String,
    @SerializedName("localization")
    val localization: String,
    @SerializedName("temperature")
    val temperature: String,
    @SerializedName("activities")
    val activities: String,
    @SerializedName("point")
    val point: String,
    @SerializedName("information")
    val information: String
) : Serializable