package com.example.appselect_testtask

data class ReviewEntity(
    val display_title: String? = null,
    val mpaa_rating: String? = null,
    val critics_pick: Int? = null,
    val byline: String? = null,
    val headline: String? = null,
    val summary_short: String? = null,
    val publication_date: String? = null,
    val opening_date: String? = null,
    val date_updated: String? = null,
    val link: Link? = null,
    val multimedia: Multimedia? = null
) {
}

data class Link(
    val type: String? = null,
    val url: String? = null,
    val suggested_link_text: String? = null
)

data class Multimedia(
    val type: String? = null,
    val src: String? = null,
    val width: Int? = null,
    val height: Int? = null,
)