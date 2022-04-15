package fr.emiliennury.cleancoding.data.datasource.character.remote

import fr.emiliennury.cleancoding.data.model.MarvelResponse
import retrofit2.Response

interface CharacterRemoteDataSource {
    suspend fun getAllCharacter(): Response<MarvelResponse>
}