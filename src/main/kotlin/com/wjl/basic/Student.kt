package com.wjl.basic

class Student : Person, Study {

    var sno = ""
    var grade = 0

    constructor() {
    }

    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun readBooks() {
        println("$name is reading.")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }

    override fun toString(): String {
        return "Student(sno='$sno', grade=$grade)"
    }

}
