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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme


@Composable
fun Land1(navController: NavHostController) {


    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        Card {

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center) {

                Image(painter = painterResource(id = R.drawable.labn),
                    contentDescription = "Destination",
                    modifier = Modifier
                        .fillMaxSize()
                        .height(200.dp),
                    contentScale = ContentScale.Crop)

                Text(
                    text = "Indulge in unmatched property",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,

                    )//end of box



            }
            Column {
                Row {
                    // Button
                    OutlinedButton(
                        onClick = {

                            val smsIntent = Intent(Intent.ACTION_SENDTO)
                            smsIntent.data = "smsto:0112674531".toUri()
                            smsIntent.putExtra("sms_body", "Hello this is RentishaAPP ")
                            mContext.startActivity(smsIntent)

                        },
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 30.dp, vertical = 8.dp),
                        shape = RoundedCornerShape(5.dp),

                        ) {
                        Text(
                            text = "Message Agent",
                            fontWeight = FontWeight.Bold,


                            )
                    }

                }

                Row {


                    Column {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Place, contentDescription = "location",
                            )


                        }
                    }
                    Column {
                        Text(
                            text = "Syokimau",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(start = 10.dp)
                        )


                    }


                }


                Text(
                    text = "Facts & Features",
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))



                Row {


                  Text(text = "Ksh 5,000,000")
                    Column {



                    }
                }

                Row {


                    Column {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "location"
                            )


                        }
                    }
                    Column {
                        Text(
                            text = "Kirawa rd",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                }

                Row {


                    Column {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "location"
                            )


                        }
                    }
                    Column {
                        Text(
                            text = "1/2 Acre",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.padding(start = 10.dp)
                        )


                    }
                }


                Row {


                    Column {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "location"
                            )


                        }
                    }
                    Column {



                    }
                }
                androidx.compose.material3.Text(
                    text = "Ready title deeds (Cost is all inclusive)\n" +
                            "1/8 acres (50 by 100) in size \n" +
                            "6 months instalment plan, interest free – Get instalment plan\n" +
                            "20 meters from proposed Malaa- Ketraco tarmac\n" +
                            "Good all weather access road",
                    modifier = Modifier
                        .padding(
                            start = 50.dp, end = 50.dp
                        )
                )


            }
        }


    }
}
@Composable
@Preview(showBackground = true)
fun Land1Preview() {
    RentishaTheme {
        Land1(navController = rememberNavController())
    }
}

