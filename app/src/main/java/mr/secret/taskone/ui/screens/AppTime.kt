package mr.secret.taskone.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.material.MaterialTheme

import androidx.compose.foundation.layout.Box

import androidx.compose.runtime.remember

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview
fun AppTime() {
    MaterialTheme {
        Box(
        ) {
            val stopWatch = remember { StopWatch() }
           Display(
                formattedTime = stopWatch.formattedTime,
                onStartClick = stopWatch::start,
            )
        }
    }
}

