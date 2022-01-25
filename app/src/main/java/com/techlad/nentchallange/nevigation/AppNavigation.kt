package com.techlad.nentchallange.nevigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.techlad.nentchallange.feature_sections.presentation.SectionsScreen
import com.techlad.nentchallange.feature_sections.presentation.section_details.SectionDetailsScreen
import com.techlad.nentchallange.nevigation.DetailsParam.Companion.SECTION_URL

/**
 * Created by umair.khalid on 25,January,2022
 **/

@ExperimentalMaterialApi
@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Sections.title) {
        // e.g will add auth routes here if when we will extend project
        composable(Screens.Sections.title) { SectionsScreen(navController) }
        composable(Screens.SectionsDetail.title, arguments = listOf(navArgument(SECTION_URL) {
            type = NavType.StringType
        })) { SectionDetailsScreen(Modifier, it.arguments?.getString(SECTION_URL)) }
    }
}