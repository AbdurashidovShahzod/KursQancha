package uz.unzosoft.kursqancha.repository

import uz.unzosoft.kursqancha.api.CurrencyApi
import uz.unzosoft.kursqancha.models.CurrencyResponse
import uz.unzosoft.kursqancha.utils.Resource
import javax.inject.Inject

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>

}