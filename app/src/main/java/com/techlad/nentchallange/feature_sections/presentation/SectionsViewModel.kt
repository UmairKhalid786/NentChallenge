package com.techlad.nentchallange.feature_sections.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techlad.nentchallange.feature_sections.domain.model.Section
import com.techlad.nentchallange.feature_sections.domain.usecases.SectionsUseCase
import com.techlad.nentchallange.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * Created by umair.khalid on 25,January,2022
 **/

@HiltViewModel
class SectionsViewModel @Inject constructor(private val useCase: SectionsUseCase) : ViewModel() {

    private val _sectionsList = MutableStateFlow<Resource<Section>>(Resource.loading())
    val sectionsList: StateFlow<Resource<Section>> = _sectionsList

    init {
        getSectionDetail("")
    }

    fun getSectionDetail(url: String) {
        viewModelScope.launch {
            useCase.getSectionDetail(url).collect {
                _sectionsList.value = it
            }
        }
    }
}