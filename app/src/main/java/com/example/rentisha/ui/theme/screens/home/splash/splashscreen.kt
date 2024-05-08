package com.example.rentisha.ui.theme.screens.home.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.rentisha.R
import com.example.rentisha.ui.theme.RentishaTheme

import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.example.rentisha.navigation.LOGIN_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun splashscreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.background2),
                contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        val mContext = LocalContext.current

        val courotinescope = rememberCoroutineScope()
        courotinescope.launch{
            delay(2000)
            mContext.startActivity(Intent(mContext, LOGIN_URL::class.java))

        }
        Text(
            text = "Rentisha App",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))



        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.rental))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )


        Text(
            text = "Indulge In Unmatched Property",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 10.dp),
            color = Color.White



        )

    }

}


@Composable
@Preview(showBackground = true)
fun splashscreenPreview(){
    RentishaTheme {
        splashscreen(navController = rememberNavController())
    }



}
