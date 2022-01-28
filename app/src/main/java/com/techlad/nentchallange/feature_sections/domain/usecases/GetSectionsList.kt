package com.techlad.nentchallange.feature_sections.domain.usecases

import com.techlad.nentchallange.feature_sections.domain.repository.SectionsRepository

/**
 * Created by umair.khalid on 25,January,2022
 **/

class GetSectionsList(private val repository: SectionsRepository) {
    suspend operator fun invoke() = repository.getSectionsList()
}