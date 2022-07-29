package com.example.appselect_testtask

class ReviewMapper : Mapper<ReviewEntity, ReviewDto> {
    override fun transform(data: ReviewEntity): ReviewDto {
        return ReviewDto(
            display_title = data.display_title,
         mpaa_rating = data.mpaa_rating,
         summary_short = data.summary_short,
         opening_date = data.opening_date,
         picture_src = data.multimedia?.src
        )
    }
}