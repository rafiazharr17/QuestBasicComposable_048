package com.rafi.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafi.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    basicComposable(
                        rafi = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun basicComposable(rafi: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "LOGIN",
            modifier = Modifier.padding(top = 25.dp),
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Ini adalah halaman login"
        )

        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "logo umy",
            modifier = Modifier.size(300.dp).padding(top = 50.dp)
        )

        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )
        )

        Text(
            text = "RAFI ALIF AZHAR",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
        )

        Text(
            text = "20220140048",
            style = TextStyle(
                fontSize = 30.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )
        )

        Image(
            painter = painterResource(id = R.drawable.potorapi),
            contentDescription = "poto",
            modifier = Modifier.size(400.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}