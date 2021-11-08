package com.wjl.basic

fun main() {
    val student = Student("Jack", 19)
    doStudy(student)
    doStudy(null)

    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    Singleton.singletonTest()

}

fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomework()
}
