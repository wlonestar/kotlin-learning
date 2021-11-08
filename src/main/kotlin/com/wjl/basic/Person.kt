package com.wjl.basic

open class Person {

    var name = ""
    var age = 0

    constructor() {
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun eat() {
        println("$name is eating, He is $age years old.")
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

}
