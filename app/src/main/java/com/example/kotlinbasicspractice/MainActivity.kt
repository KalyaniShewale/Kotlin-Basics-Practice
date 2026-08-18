package com.example.kotlinbasicspractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinbasicspractice.number.demoCalculator
import com.example.kotlinbasicspractice.number.demoCountFrequency
import com.example.kotlinbasicspractice.number.demoDuplicateList
import com.example.kotlinbasicspractice.number.demoOfReverseString
import com.example.kotlinbasicspractice.number.demoForCountVowels
import com.example.kotlinbasicspractice.number.demoOfArraySum
import com.example.kotlinbasicspractice.number.demoOfFactorial
import com.example.kotlinbasicspractice.number.demoOfGradeCalculator
import com.example.kotlinbasicspractice.number.demoOfListMax
import com.example.kotlinbasicspractice.number.demoOfMenuDrivenProgram
import com.example.kotlinbasicspractice.number.demoOfMultiplicationTable
import com.example.kotlinbasicspractice.number.demoOfPalindromeNumber
import com.example.kotlinbasicspractice.number.demoOfSecondLargestElement
import com.example.kotlinbasicspractice.number.evenOddNumeberFinderDemo
import com.example.kotlinbasicspractice.number.largestNumerFinderInArrayDemo
import com.example.kotlinbasicspractice.ui.theme.KotlinBasicsPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Section A: Basic Practice
        // even odd number function test code
        evenOddNumeberFinderDemo()
        //Write a function to find the largest of three numbers.
        largestNumerFinderInArrayDemo()
        // Print the multiplication table of a given number.
        demoOfMultiplicationTable()
        //Write a program to count the number of vowels in a string.
        demoForCountVowels()
        //Reverse a given string using a function.
        demoOfReverseString()

        //Section B: Conditionals and Functions
        //6. Create a grade calculator using 'when'. Input marks and output grade.
        demoOfGradeCalculator()
        //Create a simple calculator using functions: add, subtract, multiply, divide.
        demoCalculator()
        //Write a function to check if a number is a palindrome.
        demoOfPalindromeNumber()
        //Create a menu-driven program using 'when' to perform different math operations.
        demoOfMenuDrivenProgram()
        //10. Write a function that returns the factorial of a number.
        demoOfFactorial()
        //Section C: Arrays and Lists
        //11. Find the sum of elements in an array.
        demoOfArraySum()
        //12. Find the maximum element in a list.
        demoOfListMax()
        //13. Remove duplicates from a list.
        demoDuplicateList()
        //14. Count frequency of each element in a list.
        demoCountFrequency()
        //15. Find the second largest element in a list.
        demoOfSecondLargestElement()


        setContent {
            KotlinBasicsPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
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
    KotlinBasicsPracticeTheme {
        Greeting("Android")
    }
}