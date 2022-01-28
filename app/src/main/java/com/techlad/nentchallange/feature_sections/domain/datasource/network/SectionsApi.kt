package com.techlad.nentchallange.feature_sections.domain.datasource.network

import com.techlad.nentchallange.feature_sections.data.datasource.network.model.SectionDto
import com.techlad.nentchallange.network.NentPath.KEY_SECTIONS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by umair.khalid on 25,January,2022
 **/

interface SectionsApi {
    @GET("${KEY_SECTIONS}/{url}")
    suspend fun getSections(@Path("url") url: String): Response<SectionDto>
}