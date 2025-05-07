package oop

class PersonKt constructor(var name: String, var age: Int) {

    constructor() : this("", 0)
    constructor(name: String) : this("", 0) {
        this.name = name
    }


    fun sayHello() {
        println("Hello, my name is $name.")
    }

}