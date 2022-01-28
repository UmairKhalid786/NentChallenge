package com.techlad.nentchallange.feature_sections.data.datasource.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.feature_sections.domain.model.SubSection

/**
 * Created by umair.khalid on 25,January,2022
 **/
@Entity
class SubSectionEntity(
    @PrimaryKey
    val id: String,
    val title: String,
    val href: String,
) {
    fun toDomainModel() =
        SubSection(id = id, title = title, href = href)
}