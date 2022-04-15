package fr.emiliennury.cleancoding.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MarvelCharacter(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("modified") val modified: String,
    @SerializedName("thumbnail") val thumbnail: MarvelThumbnail,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("comics") val comics: MarvelExtraData,
    @SerializedName("series") val series: MarvelExtraData,
    @SerializedName("stories") val stories: MarvelExtraData,
    @SerializedName("events") val events: MarvelExtraData,
    var isFavorite: Boolean = false
): Serializable
