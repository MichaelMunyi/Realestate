package com.example.rentisha.ui.theme.screens.home.apartments

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme
import com.example.rentisha.ui.theme.screens.home.home.HomeScreen

@Composable
fun Myrental(navController: NavHostController) {

    Column (modifier = Modifier.fillMaxSize()){

        Image(painter = painterResource(id = R.drawable.estate3), contentDescription ="rental1" )


    }


}



@Preview(showBackground = true)
@Composable
fun MyrentalPreview() {
    RentishaTheme {
        Myrental(navController = rememberNavController())

    }
}