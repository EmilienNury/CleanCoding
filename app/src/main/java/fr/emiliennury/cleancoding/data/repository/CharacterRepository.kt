package fr.emiliennury.cleancoding.data.repository

import fr.emiliennury.cleancoding.data.model.MarvelResponse
import retrofit2.Response

interface CharacterRepository {
    suspend fun getPaginatedCharacters(): Response<MarvelResponse>
}