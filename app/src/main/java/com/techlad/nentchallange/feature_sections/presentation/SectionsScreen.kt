package com.techlad.nentchallange.feature_sections.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.techlad.nentchallange.nevigation.DetailsParam
import com.techlad.nentchallange.nevigation.Screens
import com.techlad.nentchallange.feature_sections.domain.Resource.Status.ERROR
import com.techlad.nentchallange.feature_sections.domain.Resource.Status.LOADING
import com.techlad.nentchallange.feature_sections.domain.Resource.Status.SUCCESS


/**
 * Created by umair.khalid on 25,January,2022
 **/

@ExperimentalMaterialApi
@Composable
fun SectionsScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    viewModel: SectionsViewModel = hiltViewModel()
) {
    val sectionsResponse = viewModel.sectionsList.collectAsState()

    when (sectionsResponse.value.status) {
        LOADING -> {
            Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        SUCCESS -> {
            sectionsResponse.value.data?.let {
                SectionsList(list = it.sections) {
                    navController.navigate(buildDetailsIntent(it.href))
                }
            }
        }
        ERROR -> {
            TryAgainWidget(sectionsResponse.value.message) {
                viewModel.getAllSections()
            }
        }
    }
}


fun buildDetailsIntent(url: String) =
    Screens.SectionsDetail.title.replace("{${DetailsParam.SECTION_URL}}",
        url)