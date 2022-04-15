package fr.emiliennury.cleancoding.data.repository

import fr.emiliennury.cleancoding.data.datasource.character.remote.CharacterRemoteDataSource
import fr.emiliennury.cleancoding.data.model.MarvelResponse
import retrofit2.Response

class CharacterRepositoryImpl(
    private val remoteDataSource: CharacterRemoteDataSource
): CharacterRepository {
    override suspend fun getPaginatedCharacters(): Response<MarvelResponse> {
        return remoteDataSource.getAllCharacter()
    }
}