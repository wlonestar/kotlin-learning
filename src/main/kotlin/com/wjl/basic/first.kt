package com.wjl.basic

import kotlin.math.max

fun main() {
    println("Hello, world!")

    // val values can't change
    val b = 10
    println(b)

    // var values can change
    var a: Int = 10
    a *= 10
    println("a = $a")

    val x = 37
    val y = 40
    val value = largeNumber(x, y)
    println("large number is $value")
    val value2 = largeNumber2(x, y)
    println(value2)

    val num = 10.0
    checkNumber(num)

    // loop
    for (i in 0..10) {
        println(i)
    }
    for (i in 0 until 10 step 2) {
        println(i)
    }
    for (i in 10 downTo 1) {
        println(i)
    }

}

fun largeNumber(num1: Int, num2: Int) = max(num1, num2)

fun largeNumber2(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> print("number is Double")
        else -> print("number not support")
    }
}


