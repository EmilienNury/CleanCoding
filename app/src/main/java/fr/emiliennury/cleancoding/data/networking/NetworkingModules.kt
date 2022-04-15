package fr.emiliennury.cleancoding.data.networking

import com.google.gson.Gson
import fr.emiliennury.cleancoding.BuildConfig.BASE_URL
import fr.emiliennury.cleancoding.data.networking.interceptor.OkHttpClientInterceptor
import fr.emiliennury.cleancoding.data.networking.service.CharacterService
import fr.emiliennury.cleancoding.data.networking.service.ComicsService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkingModules {

    private val okHttpModule = module {
        single {
            OkHttpClient.Builder()
                .addInterceptor(OkHttpClientInterceptor())
                .build()
        }
    }

    private val retrofitModule = module {
        single {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(get())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()
        }
    }

    private val serviceModule = module {
        factory {
            get<Retrofit>().create(CharacterService::class.java)
        }
        factory {
            get<Retrofit>().create(ComicsService::class.java)
        }
    }

    val all = arrayOf(
        okHttpModule,
        retrofitModule,
        serviceModule
    )


}