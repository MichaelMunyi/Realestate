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
fun Apartment1(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){

        Card {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.apartmmnt1),
                    contentDescription = "Hotel",
                    modifier = Modifier
                        .padding(start = 50.dp, end = 50.dp)
                            )

            }
        }





        Text(text = "QUICK SUMMARY\n" +
                "Only 30 mins drive from CBD\n" +
                "Three Bedroom Bungalows\n" +
                "Comfortable Living room with lovely dinning area.\n" +
                "Well finished kitchen with Sizeable pantry.\n" +
                "Master bedroom with majestic finishes.\n" +
                "Fresh Water Borehole on Site.\n" +
                "Community Living with Perimeter Fence.\n" +
                "Payment Terms:- 20% Deposit balance payable within 3Months.\n" +
                "Mortgage Finance Available",
            modifier = Modifier
                .padding(start = 50.dp, end = 50.dp)

            )



    }
}

@Composable
@Preview(showBackground = true)
fun Apartment1Preview() {
    RentishaTheme {
        Apartment1(navController = rememberNavController())

    }

}