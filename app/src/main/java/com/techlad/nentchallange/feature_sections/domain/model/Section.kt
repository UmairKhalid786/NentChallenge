package com.techlad.nentchallange.feature_sections.domain.model

/**
 * Created by umair.khalid on 25,January,2022
 **/

data class Section(
    val sectionId: String?,
    val title: String,
    val pageType: String,
    val description: String,
    var sections: List<SubSection>
)