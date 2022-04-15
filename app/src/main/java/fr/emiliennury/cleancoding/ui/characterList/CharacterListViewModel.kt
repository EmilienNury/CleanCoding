package fr.emiliennury.cleancoding.ui.characterList

import androidx.lifecycle.*
import fr.emiliennury.cleancoding.data.model.MarvelCharacter
import fr.emiliennury.cleancoding.domain.GetAllCharacterUseCase

class CharacterListViewModel(
    private val useCase: GetAllCharacterUseCase
) : ViewModel() {

    fun allCharacters(): LiveData<List<MarvelCharacter>> {
        return liveData {
            emit(useCase().body()?.data?.results ?: emptyList())
        }

    }

}