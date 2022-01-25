package com.techlad.nentchallange.feature_sections.domain.repository

import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.utils.Resource
import kotlinx.coroutines.flow.Flow

/**
 * Created by umair.khalid on 25,January,2022
 **/

interface SectionsRepository {
    suspend fun getSectionDetail(url : String): Flow<Resource<Section>>
}