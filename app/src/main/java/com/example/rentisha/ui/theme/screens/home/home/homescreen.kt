package com.example.rentisha.ui.theme.screens.home.home

import com.example.rentisha.R
import com.example.rentisha.navigation.ADD_HOUSE_URL
import com.example.rentisha.navigation.APARTMENT1_URL
import com.example.rentisha.navigation.APARTMENT3_URL
import com.example.rentisha.navigation.LAND_URL
import com.example.rentisha.navigation.LOGIN_URL
import com.example.rentisha.navigation.RENTAL1_URL
import com.example.rentisha.navigation.SIGNUP_URL
import com.example.rentisha.ui.theme.RentishaTheme


import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentisha.navigation.APARTMENT4_URL
import com.example.rentisha.navigation.CONTENT_URL
import com.example.rentisha.navigation.HOME_URL
import com.example.rentisha.ui.theme.screens.home.content.MyContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(

        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds

            )


            .fillMaxSize(),
        horizontalAlignment = CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(SIGNUP_URL)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title,
                                        modifier = Modifier.clickable {
                                            navController.navigate(HOME_URL)
                                            }
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title,
                                    modifier = Modifier.clickable { navController.navigate(HOME_URL) })
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Email,
                            contentDescription = "menu",
                            modifier = Modifier.clickable { navController.navigate(ADD_HOUSE_URL) })
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = CenterHorizontally
                ){



                    val mContext = LocalContext.current
                    //topappbar
                    TopAppBar(title = {
                        Text(
                            text = "Rentisha App",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    },
                        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
                        navigationIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "Menu",
                                    tint = Color.Black
                                )

                            }
                        },
                        actions = {
                            IconButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                mContext.startActivity(callIntent)

                            }) {
                                Icon(
                                    imageVector = Icons.Default.Call, contentDescription = "Share",
                                    tint = Color.Black
                                )

                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Search",
                                    Modifier.clickable { navController.navigate(ADD_HOUSE_URL) },
                                    tint = Color.Black
                                    ,
                                )

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Default.Notifications,
                                    contentDescription = "Notification",
                                    tint = Color.Black
                                )

                            }
                        }

                    )

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
//End of topappbar

                    Spacer(modifier = Modifier.height(5.dp))



                    var search by remember { mutableStateOf("") }

                    OutlinedTextField(value = search, onValueChange ={search =it},
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp),

                        placeholder = { Text(text = "Search")
                        },
                        leadingIcon = { Icon(imageVector = Icons.Default.Search,
                            contentDescription ="Search" )}

                    )//end of searchbar


                    Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {


                        Spacer(modifier = Modifier.height(5.dp))
                        Row() {

                            OutlinedButton(onClick = { navController.navigate(APARTMENT3_URL)}) {
                                Text(text = "Houses for Rent")

                            }

                            Spacer(modifier = Modifier.height(5.dp))


                            OutlinedButton(onClick = {navController.navigate(APARTMENT1_URL) }) {
                                Text(text = "Houses for sale",
                                    modifier = Modifier.clickable { navController.navigate(APARTMENT1_URL) })

                            }
                            Spacer(modifier = Modifier.height(5.dp))

                            OutlinedButton(onClick = { /*TODO*/ }) {
                                Text(text = "Land for sale",
                                    modifier = Modifier.clickable { navController.navigate(LAND_URL) })

                            }

                        }
                    }
                    //column1
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

                        Spacer(modifier = Modifier.height(10.dp))


//Row1
                        Row(
                            modifier = Modifier.padding(20.dp)
                        ) {
//column 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.rentan1),
                                            contentDescription = "Hotel",
                                            modifier = Modifier
                                                .clickable { navController.navigate(APARTMENT1_URL) }
                                                .fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favorite",
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )

                                    }
                                }
                                Text(
                                    text = "Sr Francis",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Text(
                                    text = "Ksh42,000/month",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
Row {


    Column {
        IconButton(onClick = { navController.navigate(CONTENT_URL) }) {
            Icon(imageVector = Icons.Default.Place, contentDescription ="location" )


        }
    }
    Column {
        Text(text = "Westlands" ,
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 10.dp))


    }
}
                            }//end of column

                            Spacer(modifier = Modifier.width(10.dp))


//column 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.hous1),
                                            contentDescription = "Hotel",
                                            modifier = Modifier
                                                .clickable { navController.navigate(APARTMENT3_URL) }
                                                .fillMaxSize(),


                                            contentScale = ContentScale.FillBounds,

                                            )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favorite",
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))


                                }



                                Text(
                                    text = "City View",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )

                                Spacer(modifier = Modifier.height(5.dp))


                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "Ksh. 35,000/month",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Text(text = "Westlands,Naorobi")

                                Row {
                                    Column {
                                        IconButton(onClick = {  }) {
                                            Icon(imageVector = Icons.Default.Place, contentDescription ="location" )


                                        }
                                    }
                                    Column {
                                        Text(text = "Kipande rd" ,
                                            fontSize = 15.sp,
                                            fontFamily = FontFamily.Serif,
                                            fontWeight = FontWeight.ExtraBold,
                                            modifier = Modifier.padding(start = 10.dp))


                                    }
                                }


                            }//end of column
                        }
                        //End of Row1
                        Spacer(modifier = Modifier.height(10.dp))


//Row1
                        Row(
                            modifier = Modifier.padding(20.dp)
                        ) {


//column 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.hous2),
                                            contentDescription = "Hotel",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favorite",
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))


                                }



                                Text(
                                    text = "Kamulu ",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "s",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "35,000,000Ksh",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Spacer(modifier = Modifier.height(5.dp))



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
                                            fontWeight = FontWeight.ExtraBold,
                                            modifier = Modifier.padding(start = 10.dp))


                                    }
                                }

                            }//end of column

                            Spacer(modifier = Modifier.width(10.dp))


//column 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.apartment4),
                                            contentDescription = "Hotel",
                                            modifier = Modifier
                                                .clickable { navController.navigate(APARTMENT4_URL) }
                                                .fillMaxSize(),

                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favorite",
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))


                                }



                                Text(
                                    text = "ELITE GARDENS ",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Spacer(modifier = Modifier.height(5.dp))


                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "3,000,000 Ksh",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier.padding(start = 10.dp)


                                )
                                Spacer(modifier = Modifier.height(5.dp))


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
                                            fontWeight = FontWeight.ExtraBold,
                                            modifier = Modifier.padding(start = 10.dp))


                                    }
                                }


                            }//end of column
                        }


                    }
                }








            }
        )         }

}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Signup",
        route="signup",
        selectedIcon=Icons.Filled.Face,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)




@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    RentishaTheme {
        HomeScreen(navController = rememberNavController())
    }
}