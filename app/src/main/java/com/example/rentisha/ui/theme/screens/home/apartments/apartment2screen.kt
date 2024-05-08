
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
fun Apartment2(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){

        Card {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.apartment2),
                    contentDescription = "Hotel",
                    modifier = Modifier
                        .padding(start = 50.dp, end = 50.dp)
                )

            }
        }





        Text(text = "Elite garden is Nested in the middle of magnificent sceneries, surrounded by breathtaking views of Lukenya Hills, " +
                "Mua Hills and Koma Hill, located 1.5km off tarmac, 60 minutes drive from CBD, 35 minutes drive from JKIA," +
                " 5 minutes drive from Koma Town  off Kangundo road. Hence offering a serene haven for those seeking a harmonious blend of nature and modern living.  \n" +
                "\n")



    }
}

@Composable
@Preview(showBackground = true)
fun Apartment2Preview() {
    RentishaTheme {
        Apartment2(navController = rememberNavController())

    }

}