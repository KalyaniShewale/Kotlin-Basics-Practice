package com.example.kotlinbasicspractice.number

import android.util.Log

fun largestNumerFinderInArray(arr: Array<Int>): Int? {
    return arr.maxOrNull()
}

fun largestNumerFinderInArrayDemo() {

    //Write a function to find the largest of three numbers.
    val arr = arrayOf(1, 2, 3)
    val largestNumber = largestNumerFinderInArray(arr)
    Log.d("Result of largestNumber", largestNumber.toString())
    val largestNumber2 = largestNumerFinderInArray(arrayOf(10, 40, 30))
    Log.d("Result of largestNumber2", largestNumber2.toString())
}