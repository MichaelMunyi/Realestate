
import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.example.rentisha.navigation.APARTMENT2_URL
import com.example.rentisha.navigation.CONTENT_URL
import com.example.rentisha.ui.theme.RentishaTheme
import com.example.rentisha.ui.theme.screens.home.login.LoginScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Apartment2(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
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
                                navController.navigate(bottomNavItem.route)
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
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{

                val mContext = LocalContext.current

                Column (modifier = Modifier
                    .padding(50.dp)
                    .fillMaxSize()){

                    Card {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.hous7),
                                contentDescription = "Hotel",
                                modifier = Modifier
                                    .padding(start = 10.dp, end = 10.dp,


                                        )        )
                        }
                        Column {
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


                                Column(modifier = Modifier.padding()) {
                                    IconButton(onClick = {  }) {
                                        Icon(imageVector = Icons.Default.Place, contentDescription ="location",
                                        )


                                    }
                                }
                                Column() {

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

                            Spacer(modifier = Modifier.height(35.dp))



                            Button(
                                onClick ={ (navController.navigate(APARTMENT2_URL))
                                },

                                shape = RoundedCornerShape(5.dp),
                                colors = ButtonDefaults.buttonColors(Color.Blue),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 30.dp, end = 30.dp)


                            )

                            {
                                Text(text = "Login",
                                    fontWeight = FontWeight.ExtraBold)

                            }

                        }


                    }
                }








            }



        )

    }
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
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)


@Composable
@Preview(showBackground = true)
fun Apartment2Preview() {
    RentishaTheme {
        Apartment2(navController = rememberNavController())

    }

}