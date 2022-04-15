package fr.emiliennury.cleancoding.data.datasource.character.remote

import fr.emiliennury.cleancoding.data.model.MarvelResponse
import fr.emiliennury.cleancoding.data.networking.service.CharacterService
import retrofit2.Response

class CharacterRemoteDataSourceImpl(
    private val service: CharacterService
): CharacterRemoteDataSource {
    override suspend fun getAllCharacter(): Response<MarvelResponse> {
        return service.getCharacters()
    }
}