package fr.emiliennury.cleancoding.data.repository

import org.koin.dsl.module

object RepositoryModules {
    private val repositoryModule = module {
        single<CharacterRepository> {
            CharacterRepositoryImpl(get())
        }
    }

    val all = arrayOf(
        repositoryModule
    )
}