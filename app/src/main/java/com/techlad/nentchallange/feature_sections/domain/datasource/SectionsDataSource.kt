package com.techlad.nentchallange.feature_sections.domain.datasource

import com.techlad.nentchallange.feature_sections.domain.Resource
import com.techlad.nentchallange.feature_sections.domain.model.Section

/**
 * Created by umair.khalid on 25,January,2022
 **/

interface SectionsDataSource {
    suspend fun getSections(url: String): Resource<Section>
}