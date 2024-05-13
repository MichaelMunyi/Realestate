package com.example.rentisha.navigation

import Apartment2
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.ui.theme.screens.home.apartments.Apartment1
import com.example.rentisha.ui.theme.screens.home.apartments.Apartment3
import com.example.rentisha.ui.theme.screens.home.apartments.Apartment4
import com.example.rentisha.ui.theme.screens.home.apartments.Land1
import com.example.rentisha.ui.theme.screens.home.apartments.Myrental
import com.example.rentisha.ui.theme.screens.home.content.MyContent
import com.example.rentisha.ui.theme.screens.home.home.HomeScreen
import com.example.rentisha.ui.theme.screens.home.houses.AddHouseScreen
import com.example.rentisha.ui.theme.screens.home.houses.ViewHouseScreen

import com.example.rentisha.ui.theme.screens.home.login.LoginScreen
import com.example.rentisha.ui.theme.screens.home.splash.splashscreen
import com.example.rentisha.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(SPLASH_URL){
          HomeScreen(navController = navController)

    }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)

        }

        composable(LOGIN_URL){
            LoginScreen(navController = navController)

        }
        composable(HOME_URL){
            HomeScreen(navController = navController)

        }

        composable(SPLASH_URL   ){
            splashscreen(navController = navController)

        }

        composable(ADD_HOUSE_URL   ){
            AddHouseScreen(navController = navController)

        }

        composable(VIEW_HOUSE_URL  ){
           ViewHouseScreen(navController = navController)

        }

        composable(APARTMENT1_URL  ){
           Apartment1(navController = navController)

        }
composable(APARTMENT1_URL  ){
           Apartment1(navController = navController)

        }
composable(APARTMENT2_URL  ){
         Apartment2(navController = navController)

        }
composable(APARTMENT3_URL  ){
         Apartment3(navController = navController)

        }
composable(APARTMENT4_URL  ){
         Apartment4(navController = navController)

        }
        composable(CONTENT_URL ){
            MyContent(navController = navController)

        }

        composable(RENTAL1_URL ){
            Myrental(navController = navController)

        }

        composable(LAND_URL ){
            Land1(navController = navController)

        }



    }
}