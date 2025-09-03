package com.vitoroliveira.basicstatecodelab.ui.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vitoroliveira.basicstatecodelab.ui.theme.BasicStateCodelabTheme
import com.vitoroliveira.basicstatecodelab.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = stringResource(R.string.water_counter_text, count),
            modifier = modifier.padding(top = 8.dp)
        )
        Button(
            onClick = {
                count += 1
            }
        ) {
            Text(text = stringResource(R.string.water_counter_btn_text))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    BasicStateCodelabTheme {
        WaterCounter()
    }
}