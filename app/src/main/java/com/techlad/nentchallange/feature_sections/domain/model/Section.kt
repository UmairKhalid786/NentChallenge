package com.techlad.nentchallange.feature_sections.domain.model

/**
 * Created by umair.khalid on 25,January,2022
 **/

data class Section(
    val id: String,
    val title: String,
    val description: String,
    val href: String,
    val sections: List<Section>
)