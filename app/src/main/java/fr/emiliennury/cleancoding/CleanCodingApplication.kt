@file:Suppress("unused")

package fr.emiliennury.cleancoding

import android.app.Application
import fr.emiliennury.cleancoding.data.datasource.DataSourceModules
import fr.emiliennury.cleancoding.data.networking.NetworkingModules
import fr.emiliennury.cleancoding.data.repository.RepositoryModules
import fr.emiliennury.cleancoding.domain.DomainModules
import fr.emiliennury.cleancoding.ui.UIModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class CleanCodingApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CleanCodingApplication)
            modules(
                *NetworkingModules.all,
                *DataSourceModules.all,
                *RepositoryModules.all,
                *DomainModules.all,
                *UIModules.all
            )
        }
    }
}