package com.example.kotlinbasicspractice.number

import android.util.Log

fun EvenOddNumeberFinder(number: Int): Boolean {
    return number % 2 == 0
}

fun evenOddNumeberFinderDemo() {
// even odd number function test code
    val evenOddNumberResult1 = EvenOddNumeberFinder(10)
    val evenOddNumberResult2 = EvenOddNumeberFinder(11)
    Log.d("Result of evenOddNumber1", evenOddNumberResult1.toString())
    Log.d("Result of evenOddNumber2", evenOddNumberResult2.toString())
}