package com.vitoroliveira.basicstatecodelab.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vitoroliveira.basicstatecodelab.ui.components.WaterCounter
import com.vitoroliveira.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        WaterCounter(modifier = Modifier
            .padding(innerPadding)
        )
    }
}


@Preview()
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme {
        WellnessScreen()
    }
}