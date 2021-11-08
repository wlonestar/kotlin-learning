package com.wjl.basic

import java.util.*

fun main() {
    // can't change
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    var maxLengthFruit = ""
//    for (fruit in list) {
//        if (fruit.length > maxLengthFruit.length) {
//            maxLengthFruit = fruit
//        }
//    }
    val maxLengthFruit = list.maxByOrNull { it.length }
    val newList = list.map { it.uppercase(Locale.getDefault()) }
    println(newList.toString())
    println("max length fruit is $maxLengthFruit")

    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (fruit in set) {
        println(fruit)
    }

    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    for ((fruit, number) in map) {
        println("fruit is $fruit, number is $number")
    }


}
