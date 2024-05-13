package com.example.rentisha.ui.theme.screens.home.apartments

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme
import com.example.rentisha.ui.theme.screens.home.login.LoginScreen

@Composable
fun Apartment4(navController: NavHostController){
    val mContext = LocalContext.current

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()))

    {

        Card {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.apartmmnt1),
                    contentDescription = "Hotel",
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp,


                            )        )
            }
            Column (modifier = Modifier.padding(50.dp)){
                Row {
                    // Button
                    OutlinedButton(
                        onClick = {

                            val smsIntent= Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0112674531".toUri()
                            smsIntent.putExtra("sms_body","Hello this is RentishaAPP ")
                            mContext.startActivity(smsIntent)

                        },
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 30.dp, vertical = 8.dp),
                        shape = RoundedCornerShape(5.dp),

                        ) {
                        Text(text = "Message Agent",
                            fontWeight = FontWeight.Bold,



                            )
                    }

                }

                Row {


                    Column {
                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.Place, contentDescription ="location",
                            )


                        }
                    }
                    Column {
                        Text(text = "Syokimau" ,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(start = 10.dp))


                    }



                }


                Text(text = "Facts & Features",
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))



                Row {


                    Column {
                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.Place, contentDescription ="location" )


                        }
                    }
                    Column {
                        Text(text = "Syokimau" ,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp))


                    }
                }

                Row {


                    Column {
                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="location" )


                        }
                    }
                    Column {
                        Text(text = "Master ensuite" ,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp))


                    }
                }

                Row {


                    Column {
                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="location" )


                        }
                    }
                    Column {
                        Text(text = "Fibre Internet" ,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp))


                    }
                }


                Row {


                    Column {
                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="location" )


                        }
                    }
                    Column {
                        Text(text = "Fibre Internet" ,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp))


                    }
                }



                Text(
                    text = "QUICK SUMMARY\n" +
                            "Located along Kangundo road\n" +
                            "Only 30 mins drive from CBD\n" +
                            "Next to Malaa Shopping Centre\n" +
                            "Three Bedroom Bungalows\n" +
                            "Comfortable Living room with lovely dinning area.\n" +
                            "Well finished kitchen with Sizeable pantry.\n" +
                            "Master bedroom with majestic finishes.\n" +
                            "Fresh Water Borehole on Site.\n" +
                            "Community Living with Perimeter Fence.\n" +
                            "Payment Terms:- 20% Deposit balance payable within 3Months.\n" +
                            "Mortgage Finance Available"
                ,
                    Modifier.padding(start = 20.dp))

            }
        }


    }
}

@Composable
@Preview(showBackground = true)
fun Apartment4Preview() {
    RentishaTheme {
        Apartment4(navController = rememberNavController())

    }

}