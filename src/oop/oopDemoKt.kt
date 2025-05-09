package oop

fun main() {

    val harry = PersonKt("Harry", 18)
    harry.sayHello()

    val selena = PersonKt.getInstance("selena", 18)

    val madonna = PersonKt.getInstance("Madonna")

    val thirdPerson = PersonKt.getInstance(selena)
    thirdPerson.name = "Vega"

    println(selena.name)












}