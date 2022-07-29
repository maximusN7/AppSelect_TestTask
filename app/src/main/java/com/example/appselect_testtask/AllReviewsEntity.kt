package com.example.appselect_testtask

data class AllReviewsEntity(
    val status: String? = null,
    val copyright: String? = null,
    val has_more: Boolean? = null,
    val num_results: Int? = null,
    val results: Array<ReviewEntity>? = null
)