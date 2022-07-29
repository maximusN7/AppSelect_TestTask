package com.example.appselect_testtask

interface Mapper<SRC, DTO> {
    fun transform(data: SRC): DTO
}