package com.wahyurhy.mengapaperlucompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wahyurhy.mengapaperlucompose.ui.theme.MengapaPerluComposeTheme

class Sample2ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MengapaPerluComposeTheme {
                Sample2ComposeApp()
            }
        }
    }
}

@Composable
fun Sample2ComposeApp() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            ContactCardVersion1()
            ContactCardVersion2("Wahyu Rahayu")
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                ButtonWithText(text = "Jangan Sedih")
            }
        }
    }
}

@Composable
fun ContactCardVersion1() {
    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Box {
            Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "Avatar")
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "Online Status",
                tint = Color.Green,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Column {
            Text(text = "Wahyu Rahayu", fontWeight = FontWeight.Bold)
            Text(text = "Online")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardVersion1Preview() {
    MengapaPerluComposeTheme {
        ContactCardVersion1()
    }
}

@Composable
fun ContactCardVersion2(name: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = {})
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "Avatar",
            modifier = Modifier
                .padding(4.dp)
                .border(2.dp, Color.Green, CircleShape)
                .clip(CircleShape)
                .size(60.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = "Online")
        }
        Icon(
            imageVector = Icons.Filled.Check,
            contentDescription = null,
            modifier = Modifier.offset(x = 8.dp, y = 30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardVersion2Preview() {
    MengapaPerluComposeTheme {
        ContactCardVersion2("Wahyu Rahayu")
    }
}

@Composable
fun ButtonWithText(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.purple_500)),
        modifier = modifier.padding(4.dp)
    ) {
        Text(text = text, textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonWithTextPreview() {
    MengapaPerluComposeTheme {
        ButtonWithText(text = "Tekan Aku")
    }
}

