package mr.secret.taskone.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.*
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class StopWatch1 {

    var formattedTime1 by mutableStateOf("00:000")
    private var coroutineScope1 = CoroutineScope(Dispatchers.Main)
    private var isActive1 = false

    private var timeMillis1 = 0L
    private var lastTimestamp1 = 0L

    @RequiresApi(Build.VERSION_CODES.O)
    fun start1() {
        if(isActive1) return
        coroutineScope1.launch {
            lastTimestamp1 = System.currentTimeMillis()
            this@StopWatch1.isActive1 = true
            while(this@StopWatch1.isActive1) {
                delay(10L)
                timeMillis1 += System.currentTimeMillis() - lastTimestamp1
                lastTimestamp1 = System.currentTimeMillis()
                formattedTime1 = formatTime1(timeMillis1)
            }
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun formatTime1(timeMillis: Long): String {
        val localDateTime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(timeMillis),
            ZoneId.systemDefault()
        )
        val formatter = DateTimeFormatter.ofPattern(
            "ss:SSS",
            Locale.getDefault()
        )
        return localDateTime.format(formatter)
    }
}