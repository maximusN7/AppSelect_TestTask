package com.example.appselect_testtask.retrofit

import com.example.appselect_testtask.AllReviewsEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitServices {

    @GET("reviews/all.json")
    suspend fun getAllReviews(
        @Query("api-key") queryKey: String,
    ): AllReviewsEntity
}