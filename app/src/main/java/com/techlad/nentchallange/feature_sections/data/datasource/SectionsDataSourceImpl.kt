package com.techlad.nentchallange.feature_sections.data.datasource

import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.utils.Resource

class SectionsDataSourceImpl : SectionsDataSource {
    // Can be stored anywhere, network, local storage etc
    private val sections =
        Section(
            id = "0",
            title = "Mobile",
            href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            sections = listOf(Section(
                id = "1",
                title = "Mobile",
                href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
                description = "Lorem consequat.",
                sections = listOf()
            ), Section(
                id = "2",
                title = "Mobile",
                href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
                description = "Lorem consequat.",
                sections = listOf()
            ), Section(
                id = "3",
                title = "Mobile",
                href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
                description = "Lorem consequat.",
                sections = listOf()
            ), Section(
                id = "4",
                title = "Mobile",
                href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
                description = "Lorem consequat.",
                sections = listOf()
            ), Section(
                id = "5",
                title = "Mobile",
                href = "https://content.viaplay.se/androidexo-se/serier{?dtg}",
                description = "Lorem consequat.",
                sections = listOf()
            ))
        )

    override fun getSections(): Resource<Section> {
        return Resource.success(sections)
    }
}