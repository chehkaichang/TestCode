package com.example.testcode

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("TransService.aspx?UnitId=QcbUEzN6E6DL")
    fun index(): Call<List<OpenData>>
}