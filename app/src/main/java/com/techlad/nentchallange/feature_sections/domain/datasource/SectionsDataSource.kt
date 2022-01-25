package com.techlad.nentchallange.feature_sections.domain.datasource

import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.utils.Resource

/**
 * Created by umair.khalid on 25,January,2022
 **/

interface SectionsDataSource {
    fun getSections(): Resource<Section>
}