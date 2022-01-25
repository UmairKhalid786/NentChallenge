package com.techlad.nentchallange.feature_sections.data.repository

import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.feature_sections.domain.repository.SectionsRepository
import com.techlad.nentchallange.utils.Resource
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * Created by umair.khalid on 25,January,2022
 **/

class SectionsRepositoryImp @Inject constructor(private val dataSource: SectionsDataSource) :
    SectionsRepository {
    override suspend fun getSectionDetail(url: String): Flow<Resource<Section>> {
        return flow {
            emit(Resource.loading())
            val result = dataSource.getSections()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}