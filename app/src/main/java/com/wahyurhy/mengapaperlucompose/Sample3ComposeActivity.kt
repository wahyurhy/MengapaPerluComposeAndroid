package com.wahyurhy.mengapaperlucompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wahyurhy.mengapaperlucompose.ui.theme.MengapaPerluComposeTheme

class Sample3ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MengapaPerluComposeTheme {
                Sample3ComposeApp()
            }
        }
    }
}

@Composable
fun Sample3ComposeApp() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        JetCoffeApp()
    }
}

@Composable
fun JetCoffeApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "My Scaffold")
                },
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello World!")
        }
    }
}

@Preview
@Composable
fun JetCoffeAppPreview() {
    MengapaPerluComposeTheme {
        JetCoffeApp()
    }
}