package com.example.bussinescard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinescard.ui.theme.BussinesCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinesCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val myIcons = Icons.Rounded
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color(213, 234, 216))
    ) {
        ProfileInfo(
            modifier = modifier
        )
        Row {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.padding(top = 200.dp)
            ) {
                ContactInfo(
                    textInfo = stringResource(id = R.string.phone),
                    nameIcon = myIcons.Phone,
                    modifier = modifier
                )
                ContactInfo(
                    textInfo = stringResource(id = R.string.socialid),
                    nameIcon = myIcons.Share,
                    modifier = modifier
                )
                ContactInfo(
                    textInfo = stringResource(id = R.string.mail),
                    nameIcon = myIcons.Email,
                    modifier = modifier
                )
            }
        }
    }
}

@Composable
fun ProfileInfo(modifier: Modifier = Modifier) {
    val img = painterResource(id = R.drawable.logo)
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = modifier.fillMaxHeight(0.5f)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Image(
                alignment = Alignment.Center,
                painter = img,
                contentDescription = null,
                modifier = modifier
                    .width(100.dp)
                    .background(Color(0xFF346E96))
                    .padding(20.dp)
            )
            Text(
                text = stringResource(id = R.string.name),
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                modifier = modifier
                    .padding(top = 15.dp)
            )
            Text(
                color = Color(0xFF009933),
                fontWeight = FontWeight.Bold,
                text = stringResource(id = R.string.title),
                modifier = modifier
            )
        }
    }
}

@Composable
fun ContactInfo(textInfo: String, nameIcon: ImageVector, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(10.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(0.1f)
        ) {
            Icon(
                nameIcon,
                contentDescription = textInfo,
                tint = Color(0xFF009933),
                modifier = modifier
            )
        }
        Column(
            modifier = modifier
                .fillMaxWidth(0.5f)
        ) {
            Text(
                text = textInfo,
                modifier = modifier
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinesCardTheme {
        Greeting("Android")
    }
}