package com.techlad.nentchallange.feature_sections.data.datasource.network.model.base

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.techlad.nentchallange.network.JsonKey

@JsonClass(generateAdapter = true)
data class BaseResponse<T>(
    @Json(name = JsonKey.LINKS_PARAM)
    val data: T?
)
