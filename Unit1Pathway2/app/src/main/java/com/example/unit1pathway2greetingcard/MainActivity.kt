/*
Author: David Teixeira
Project Date: 01/20/2024
Project Name: Unit 1 Pathway 2 - Greeting Card App
Project Scope: First Android application to display a greeting on mobile device
 */

// Import package lib
package com.example.unit1pathway2greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unit1pathway2greetingcard.ui.theme.Unit1Pathway2GreetingCardTheme

class MainActivity : ComponentActivity() {
    // Override the onCreate method for entry point
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Function to define layout through composable functions
        setContent {
            Unit1Pathway2GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

/* Called from setCount function and tell kotlin compiler that this function is used by jetbrains compose
1. Annotate the function with @Composable
2. @Composable must be capitalized
3. @Composable can't return anything
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Surround with widget then surround with container to set different bg color
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!",
            // Modifier is a class that can be used to modify the layout of the text
            modifier = modifier.padding(24.dp) // Add padding to the text
        )
    }
}

// Preview function to display the app on the emulator in design view
@Preview(showBackground = true) // Show background color of the theme
@Composable
fun GreetingPreview() {
    Unit1Pathway2GreetingCardTheme {
        Greeting("David")
    }
}