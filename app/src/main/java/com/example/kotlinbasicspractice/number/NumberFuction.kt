package com.example.kotlinbasicspractice.number

import android.util.Log

// Print the multiplication table of a given number.
fun demoOfMultiplicationTable() {
    multiplicationTable(5)
}

fun multiplicationTable(number: Int) {
    val result = (1..10).map { i -> number * i }
    Log.d("Result of multiplicationTable", result.toString())
}

//Write a program to count the number of vowels in a string.
fun demoForCountVowels() {
    val count = countVowels("Hello World aeiouEIOU")
    Log.d("Result of countVowels", count.toString())
}

fun countVowels(string: String): Int {
    val vowels = "aeiouAEIOU"
    return string.count { char -> vowels.contains(char) }
}


//Reverse a given string using a function
fun demoOfReverseString() {
    val string = "Hello World"
    val reverseString = reverseString(string)
    Log.d("Result of Reverse String", "$reverseString")
}

fun reverseString(string: String): String {
    return string.reversed()
}

//Create a grade calculator using 'when'. Input marks and output grade.
fun demoOfGradeCalculator() {
    val grade = gradeCalculator(90)
    Log.d("Result of gradeCalculator", grade)
}

fun gradeCalculator(i: Int): String {
    return when (i) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

//Create a simple calculator using functions: add, subtract, multiply, divide.
fun demoCalculator() {
    val A = 10
    val B = 5
    calculator(A, B)
}

fun calculator(num1: Int, num2: Int) {
    Log.d("Result of Add", (num1 + num2).toString())
    Log.d("Result of Subtraction", (num1 - num2).toString())
    Log.d("Result of multiply", (num1 * num2).toString())
    Log.d("Result of divide", (num1 / num2).toString())
}

//Write a function to check if a number is a palindrome.
fun demoOfPalindromeNumber() {
    Log.d("Result of palindromeNumber", palindromeNumber(121).toString())
}

fun palindromeNumber(i: Int): Boolean {
    return i.toString() == i.toString().reversed()
}

//Create a menu-driven program using 'when' to perform different math operations.
fun demoOfMenuDrivenProgram() {
    Log.d("Result of menuDrivenProgram", menuDrivenProgram(11, 22, "ADD"))
}

fun menuDrivenProgram(i: Int, i2: Int, s: String): String {
    return when (s) {
        "ADD" -> (i + i2).toString()
        "SUBTRACT" -> (i - i2).toString()
        "MULTIPLY" -> (i * i2).toString()
        "DIVIDE" -> (i / i2).toString()
        else -> {
            "00"
        }
    }
}

//10. Write a function that returns the factorial of a number.
fun demoOfFactorial() {
    Log.d("Result of Factorial", factorial(5).toString())
}

fun factorial(i: Int): Int {
    var result = 1
    for (i in 1..i) {
        result *= i
    }
    // Log.d("Result of Factorial", result.toString())
    return result
}

//11. Find the sum of elements in an array.
fun demoOfArraySum() {
    val array = arrayOf(1, 2, 3, 4, 5)
    Log.d("Result of Array Sum", arraySum(array).toString())
}

fun arraySum(array: Array<Int>): Int {
    return array.sum()
}

//Find the maximum element in a list.
fun demoOfListMax() {
    val list = listOf(1, 2, 3, 4, 5)
    Log.d("Result of List Max", listMax(list).toString())
}

fun listMax(list: List<Int>): Int {
    return list.max()
}

//Remove duplicates from a list.
fun demoDuplicateList() {
    val list = listOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
    Log.d("Result of Duplicate List", duplicateList(list).toString())
}

fun duplicateList(list: List<Int>): List<Int> {
    return list.distinct()
}

//14. Count frequency of each element in a list.
fun demoCountFrequency() {
    val list = listOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
    Log.d("Result of Count Frequency", countFrequency(list).toString())
}

fun countFrequency(list: List<Int>): String {
    val frequency = list.groupingBy { it }.eachCount()
    return frequency.toString()
}

//
fun demoOfSecondLargestElement() {
    val list = listOf(1, 2, 3, 4, 13, 25, 4, 3, 2, 1)
    Log.d("Result of Second Largest Element", secondLargestElement(list).toString())
}

fun secondLargestElement(list: List<Int>): Int {
    val sortedList = list.sortedDescending()
    return sortedList[1]
}
