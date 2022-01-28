package com.techlad.nentchallange.feature_sections.domain.dto

interface BaseDto<Any> {
    fun toDomainModel(): Any
}
