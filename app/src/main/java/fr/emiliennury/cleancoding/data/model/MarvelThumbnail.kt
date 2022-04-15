package fr.emiliennury.cleancoding.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MarvelThumbnail(
    @SerializedName("path") val path: String,
    @SerializedName("extension") val extension: String
): Serializable
