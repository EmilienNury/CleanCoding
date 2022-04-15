package fr.emiliennury.cleancoding.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MarvelExtraData(
    @SerializedName("available") val available: Int,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("returned") val returned: Int?,
): Serializable
