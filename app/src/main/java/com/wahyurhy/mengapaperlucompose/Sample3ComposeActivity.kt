package com.wahyurhy.mengapaperlucompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wahyurhy.mengapaperlucompose.ui.theme.MengapaPerluComposeTheme

class Sample3ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MengapaPerluComposeTheme {
                Column {
                    // Sample3ComposeApp()
                    MyTopBar()
                    FormInput()
                    StatefulCounter()
                }
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
        JetCoffeeApp()
    }
}

@Composable
fun JetCoffeeApp() {
    Scaffold(
        topBar = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colors.primary)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = null,
                    modifier = Modifier.height(40.dp)
                )
            }
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
        JetCoffeeApp()
    }
}

@Composable
fun MyTopBar() {
    var showMenu by remember { mutableStateOf(false) }
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        title = {
            Text(text = "My Scaffold")
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
            }
            IconButton(onClick = { showMenu = !showMenu }) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
            }
            DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "Call me")
                }
            }
        }
    )
}

@Preview
@Composable
fun MyTopBarPreview() {
    MengapaPerluComposeTheme {
        MyTopBar()
    }
}

@Composable
fun FormInput() {
    var name by rememberSaveable { mutableStateOf("") }
    OutlinedTextField(
        value = name,
        onValueChange = { newName ->
            name = newName
        },
        label = { Text(text = "Name") },
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    )
}

@Preview
@Composable
fun FormInputPreview() {
    MengapaPerluComposeTheme {
        FormInput()
    }
}

@Composable
fun StatefulCounter() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        var count by rememberSaveable { mutableStateOf(0) }
        Text(text = "Button clicked $count times:")
        Button(onClick = { count++ }) {
            Text(text = "Click me!")
        }
    }
}

@Preview
@Composable
fun StatefulCounterPreview() {
    MengapaPerluComposeTheme {
        StatefulCounter()
    }
}