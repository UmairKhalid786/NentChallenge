package com.techlad.nentchallange.feature_sections.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.utils.TestTags.SECTIONS_LIST

/**
 * Created by umair.khalid on 25,January,2022
 **/

@ExperimentalMaterialApi
@Composable
fun SectionsList(
    list: List<Section>,
    onSectionClick: (Section) -> Unit
) {

    LazyColumn(contentPadding = PaddingValues(16.dp), modifier = Modifier.testTag(SECTIONS_LIST)) {
        items(list.size, {
            it.toString()
        }, itemContent = {
            SectionCard(section = list[it]) {
                onSectionClick(list[it])
            }
        })
    }
}