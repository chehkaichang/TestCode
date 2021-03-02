package com.example.testcode

import io.reactivex.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("TransService.aspx?UnitId=QcbUEzN6E6DL")
    fun index(): Call<List<OpenData>>

    @GET("TransService.aspx?UnitId=QcbUEzN6E6DL")
    fun indexRX(): Single<Response<List<OpenData>>>

    //QcbUEzN6E6DL
    @GET("TransService.aspx")
    fun indexRXQuery(@Query("UnitId") unitId: String): Single<Response<List<OpenData>>>
}