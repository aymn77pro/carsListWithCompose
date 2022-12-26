package com.example.cars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cars.ui.CarsApp
import com.example.cars.ui.theme.CarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarsTheme {
            CarsApp()

            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    CarsTheme {
        CarsApp()
    }
}