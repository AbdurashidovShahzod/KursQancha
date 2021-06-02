package uz.unzosoft.kursqancha.api

import retrofit2.http.GET
import retrofit2.http.Query
import uz.unzosoft.kursqancha.models.CurrencyResponse

interface CurrencyApi {
    @GET("/latest")
    suspend fun getCurrency(
        @Query("base") base: String
    ): Result<CurrencyResponse>
}