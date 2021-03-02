package com.example.testcode

import io.reactivex.Single
import retrofit2.Response

class OpenDataRepository {
    private val apiService = AppClientManager.client.create(ApiService::class.java)

    fun indexRX(): Single<Response<List<OpenData>>> {
        return apiService.indexRX()
    }

    fun indexRXQuery(unitId: String): Single<Response<List<OpenData>>> {
        return apiService.indexRXQuery(unitId)
    }
}