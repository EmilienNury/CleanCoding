package fr.emiliennury.cleancoding.ui

import fr.emiliennury.cleancoding.ui.characterList.CharacterListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


object UIModules {
    private val characterListModule = module {
        viewModel {
            CharacterListViewModel(get())
        }
    }

    val all = arrayOf(
        characterListModule
    )
}