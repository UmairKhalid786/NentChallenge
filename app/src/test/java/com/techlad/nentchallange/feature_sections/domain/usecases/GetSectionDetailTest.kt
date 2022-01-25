package com.techlad.nentchallange.feature_sections.domain.usecases

import com.google.common.truth.Truth
import com.techlad.nentchallange.feature_sections.data.datasource.SectionsDataSourceImpl
import com.techlad.nentchallange.feature_sections.data.repository.SectionsRepositoryImpTest
import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.utils.Resource.Status.ERROR
import com.techlad.nentchallange.utils.Resource.Status.SUCCESS
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class GetSectionDetailTest {

    private lateinit var useCase: GetSectionDetail
    private lateinit var repository: SectionsRepositoryImpTest

    // This is already dummy data source
    private lateinit var fakeDataSourceFake: SectionsDataSource

    companion object {
        private const val FAKE_URL = ""
    }

    @Before
    fun setUp() {
        fakeDataSourceFake = SectionsDataSourceImpl()
        repository = SectionsRepositoryImpTest(fakeDataSourceFake)
        useCase = GetSectionDetail(repository)
    }

    @Test
    fun `Check if sections response is not null with given url`() = runBlocking {
        val section = useCase(FAKE_URL).first().data
        Truth.assertThat(section != null).isTrue()
    }

    @Test
    fun `Check if sections response is not null with given url and status is successful`() =
        runBlocking {
            val response = useCase(FAKE_URL).first()

            Truth.assertThat(response.data != null && response.status == SUCCESS)
                .isTrue()
        }

    @Test
    fun `Check if section response is failure`() = runBlocking {
        repository.testingForSuccess = false
        val section = useCase(FAKE_URL).first()
        Truth.assertThat(section.status == ERROR).isTrue()
    }

    @Test
    fun `Check if status is successful`() = runBlocking {
        repository.testingForSuccess = true
        val status = useCase(FAKE_URL).first().status
        Truth.assertThat(status == SUCCESS).isTrue()
    }

    @Test
    fun `Check if status is successful and data is not available`() = runBlocking {
        repository.testingForSuccess = true
        val response = useCase(FAKE_URL).first()

        Truth.assertThat(response.status == SUCCESS && response.data == null)
            .isFalse()
    }

}