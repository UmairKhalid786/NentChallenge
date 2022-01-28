package com.techlad.nentchallange.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.techlad.nentchallange.feature_sections.data.datasource.db.model.SectionEntity
import com.techlad.nentchallange.feature_sections.data.datasource.db.model.SubSectionEntity
import com.techlad.nentchallange.feature_sections.domain.datasource.db.dao.SectionsDao
import com.techlad.nentchallange.feature_sections.domain.datasource.db.dao.SubSectionsDao

/**
 * Created by umair.khalid on 25,January,2022
 **/


@Database(
    entities = [SectionEntity::class, SubSectionEntity::class],
    version = NentDb.VERSION,
    exportSchema = false
)
abstract class NentDb : RoomDatabase() {

    abstract fun sectionsDao(): SectionsDao
    abstract fun subSectionsDao(): SubSectionsDao

    companion object {
        internal const val VERSION = 1
        private const val NAME = "nent_db"

        fun create(applicationContext: Context): NentDb {
            return Room.databaseBuilder(
                applicationContext,
                NentDb::class.java,
                NAME
            ).build()
        }
    }
}