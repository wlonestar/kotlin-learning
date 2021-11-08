package com.wjl.standard

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    myWith(list)
    myRun(list)
    myApply(list)
}

// with function
fun myWith(list: List<String>) {
    val result = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
}

// run function
fun myRun(list: List<String>) {
    val result = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
}

// apply function
fun myApply(list: List<String>) {
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
}
