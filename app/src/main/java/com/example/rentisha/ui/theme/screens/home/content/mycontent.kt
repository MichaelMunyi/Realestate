package com.example.rentisha.ui.theme.screens.home.content


import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.ui.theme.RentishaTheme


@Composable
fun MyContent(navController: NavHostController){
    val mUrl = "https://www.geeksforgeeks.org"

    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(mUrl)
        }
    }, update = { it.loadUrl(mUrl) })


}


@Preview(showBackground = true)
@Composable
fun MyContentPreview() {
    RentishaTheme {


    MyContent(navController = rememberNavController())

    }
}