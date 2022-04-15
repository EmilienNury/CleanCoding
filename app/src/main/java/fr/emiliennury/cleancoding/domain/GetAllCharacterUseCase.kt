package fr.emiliennury.cleancoding.domain

import fr.emiliennury.cleancoding.data.model.MarvelResponse
import fr.emiliennury.cleancoding.data.repository.CharacterRepository
import retrofit2.Response

class GetAllCharacterUseCase(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(): Response<MarvelResponse> {
        return repository.getPaginatedCharacters()
    }
}