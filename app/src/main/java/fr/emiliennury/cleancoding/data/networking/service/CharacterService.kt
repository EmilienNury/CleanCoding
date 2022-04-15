package fr.emiliennury.cleancoding.data.networking.service

import fr.emiliennury.cleancoding.data.model.MarvelResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("v1/public/characters")
    suspend fun getCharacters(): Response<MarvelResponse>

    @GET("v1/public/characters/{id}?")
    suspend fun getCharacter(@Path("id") id: String): Response<MarvelResponse>
}