package com.example.papb_muhammadhaekal_235150200111024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.papb_muhammadhaekal_235150200111024.ui.theme.PAPB_MuhammadHaekal_235150200111024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAPB_MuhammadHaekal_235150200111024Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FilledButtonExample(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FilledButtonExample(modifier: Modifier = Modifier) {

    var message by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Button(
            onClick = { message = "Muhammad Haekal" }
        ) {
                Text("Klik disini")
        }


        if (message.isNotEmpty()) {
            Text(
                text = message,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    PAPB_MuhammadHaekal_235150200111024Theme {
        FilledButtonExample()
    }
}
