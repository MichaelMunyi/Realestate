package com.example.rentisha.ui.theme.screens.home.background

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme
import com.example.rentisha.ui.theme.screens.home.houses.AddHouseScreen

@Composable
fun MyScreen(navController: NavHostController){
    // Load the background image
    val backgroundImage: Painter = painterResource(id = R.drawable.rentisha)

    // Box composable to contain UI elements
    Box(
        modifier = Modifier.fillMaxSize(),
        content = {
            // Set the background image
            Image(
                painter = backgroundImage,
                contentDescription = null
            )

            // Add your other UI elements here
        }
    )
}
@Composable
@Preview(showBackground = true)
fun MyScreenScreenPreview() {
    RentishaTheme {
        MyScreen(navController = rememberNavController())
    }
}
