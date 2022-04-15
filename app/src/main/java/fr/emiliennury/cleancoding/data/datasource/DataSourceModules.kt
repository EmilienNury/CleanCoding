package fr.emiliennury.cleancoding.data.datasource

import fr.emiliennury.cleancoding.data.datasource.character.remote.CharacterRemoteDataSource
import fr.emiliennury.cleancoding.data.datasource.character.remote.CharacterRemoteDataSourceImpl
import org.koin.dsl.module

object DataSourceModules {
    private val dataSourceModule = module {
        single<CharacterRemoteDataSource> {
            CharacterRemoteDataSourceImpl(get())
        }
    }

    val all = arrayOf(
        dataSourceModule
    )
}