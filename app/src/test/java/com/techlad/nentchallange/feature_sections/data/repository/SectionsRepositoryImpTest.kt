package com.techlad.nentchallange.feature_sections.data.repository

import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.feature_sections.domain.repository.SectionsRepository
import com.techlad.nentchallange.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class SectionsRepositoryImpTest(private val sectionsDataSource: SectionsDataSource) : SectionsRepository {

    var testingForSuccess = true
    override suspend fun getSectionDetail(url: String) = flow {
        emit(if (testingForSuccess) sectionsDataSource.getSections() else Resource.error("Something went wrong"))
    }.flowOn(Dispatchers.IO)
}