package com.example.rentisha.ui.theme.screens.home.apartments


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme
import com.example.rentisha.ui.theme.screens.home.login.LoginScreen

@Composable
fun Apartment3(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){

        Card {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.apartment0),
                    contentDescription = "Hotel"
                )

            }
        }





        Text(text = "Ready title deeds (Cost is all inclusive)\n" +
                "1/8 acres (50 by 100) in size \n" +
                "6 months instalment plan, interest free – Get instalment plan\n" +
                "20 meters from proposed Malaa- Ketraco tarmac\n" +
                "Good all weather access road",
            modifier = Modifier
                .padding(start = 50.dp, end = 50.dp
                ))



    }
}

@Composable
@Preview(showBackground = true)
fun Apartment3Preview() {
    RentishaTheme {
        Apartment3(navController = rememberNavController())

    }

}