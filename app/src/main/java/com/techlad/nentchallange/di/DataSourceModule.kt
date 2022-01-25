package com.techlad.nentchallange.di

import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.feature_sections.data.datasource.SectionsDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by umair.khalid on 25,January,2022
 **/

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideSectionsDataSource(): SectionsDataSource = SectionsDataSourceImpl()
}