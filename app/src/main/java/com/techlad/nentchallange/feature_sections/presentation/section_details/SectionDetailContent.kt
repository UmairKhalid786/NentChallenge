package com.techlad.nentchallange.feature_sections.presentation.section_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlad.nentchallange.R
import com.techlad.nentchallange.feature_sections.domain.model.Section

/**
 * Created by umair.khalid on 25,January,2022
 **/


@Composable
fun SectionDetailContent(
    section: Section,
) {

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
    ) {

        MovieDetailHeader(section)

        MovieDetailSummary(section)
    }
}

@Composable
private fun MovieDetailHeader(section: Section) {
    Column {

        Image(
            painterResource(R.drawable.ic_splash),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .height(320.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = section.title,
            style = MaterialTheme.typography.h4,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "ID: ${section.id}",
            style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        )
    }
}

@Composable
private fun MovieDetailSummary(section: Section) {
    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = section.description,
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = section.title,
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = section.description,
            style = MaterialTheme.typography.body2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
        )
    }
}

@Preview
@Composable
fun MainPreview() {
    SectionDetailContent(Section("12",
        "asbc",
        "Section detail",
        "href",
        listOf(Section("12", "asbc", "Section detail","", listOf()),
            Section("12", "asbc", "Section detail","", listOf()))))
}