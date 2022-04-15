package fr.emiliennury.cleancoding.data.networking.interceptor

import fr.emiliennury.cleancoding.BuildConfig
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.security.MessageDigest
import java.util.*

class OkHttpClientInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val privateKey = BuildConfig.MARVEL_PRIVATE_API_KEY
        val publicKey = BuildConfig.MARVEL_PUBLIC_API_KEY
        val timestamp = Date().time
        val hash = hash("$timestamp$privateKey$publicKey")

        val newUrl = request.url().newBuilder()
            .addQueryParameter("apikey", publicKey) // apikey
            .addQueryParameter("ts", timestamp.toString()) // ts
            .addQueryParameter("hash", hash) // hash
            .build()

        val newRequest = request.newBuilder().url(newUrl).build()

        return chain.proceed(newRequest)
    }

    private fun hash(str: String): String {
        return MessageDigest.getInstance("MD5").digest(str.toByteArray())
            .joinToString(separator = "") { byte -> "%02x".format(byte) }
    }
}

