package com.techlad.nentchallange.di

import android.content.Context
import com.techlad.nentchallange.feature_sections.domain.datasource.db.dao.SectionsDao
import com.techlad.nentchallange.feature_sections.domain.datasource.db.dao.SubSectionsDao
import com.techlad.nentchallange.storage.NentDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

/**
 * Created by umair.khalid on 25,January,2022
 **/

@Module
@InstallIn(SingletonComponent::class)
class DbModule {

    @Provides
    fun provideDb(@ApplicationContext context: Context) = NentDb.create(context)

    @Provides
    fun provideSectionsDao(nentDb: NentDb): SectionsDao = nentDb.sectionsDao()

    @Provides
    fun provideSubSectionsDao(nentDb: NentDb): SubSectionsDao = nentDb.subSectionsDao()
}