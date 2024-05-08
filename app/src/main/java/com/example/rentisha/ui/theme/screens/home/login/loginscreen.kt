package com.example.rentisha.ui.theme.screens.home.login


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.R

import com.example.rentisha.data.AuthViewModel
import com.example.rentisha.navigation.SIGNUP_URL
import com.example.rentisha.ui.theme.RentishaTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painter = painterResource(id = R.drawable.background2),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login ",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter email",
                color = Color.White)},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),

            colors = TextFieldDefaults.outlinedTextFieldColors(
                Color.White
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password",
                color = Color.White)},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                Color.White
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(onClick = {
            authViewModel.login(email, password)
        }) {
            Text(text = "Login",
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(SIGNUP_URL)
        }) {
            Text(text = "Register instead",
                color = Color.White)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    RentishaTheme {
        LoginScreen(navController = rememberNavController())

    }

}