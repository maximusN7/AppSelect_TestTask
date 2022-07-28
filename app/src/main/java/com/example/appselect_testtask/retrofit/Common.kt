package com.example.appselect_testtask.retrofit

object Common {
    private const val BASE_URL = "api.nytimes.com/svc/movies/v2/"
    const val API_KEY = "vc4HxwRqlErhtOlYw4fsqgA1EKsA21AE"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}