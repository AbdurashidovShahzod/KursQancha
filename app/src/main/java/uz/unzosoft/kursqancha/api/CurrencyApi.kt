package uz.unzosoft.kursqancha.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.unzosoft.kursqancha.models.CurrencyResponse


interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}