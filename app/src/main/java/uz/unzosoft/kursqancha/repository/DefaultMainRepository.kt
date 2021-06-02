package uz.unzosoft.kursqancha.repository

import uz.unzosoft.kursqancha.api.CurrencyApi
import uz.unzosoft.kursqancha.models.CurrencyResponse
import uz.unzosoft.kursqancha.utils.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}