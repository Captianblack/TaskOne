package mr.secret.taskone

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import mr.secret.taskone.ui.theme.TaskOneTheme
import mr.secret.taskone.ui.screens.AppTime
import mr.secret.taskone.ui.screens.AppTime1

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskOneTheme {
                Box() {
                    AppTime()
                    AppTime1()

                }
            }
        }
    }
}

