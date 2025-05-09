package oop

import java.text.SimpleDateFormat
import java.util.Date

class  PersonKt constructor(var name: String, var age: Int) {

    var birth: Date=Date()
        get() = SimpleDateFormat("yyyy.MM.dd").parse(SimpleDateFormat("yyyy.MM.dd").format(field))
        private set(value) {field=value}

    constructor() : this("", 0)
    constructor(name: String) : this(name, 0) {
        this.name = name
    }

    init {
        println("_________________kotlin")
    }

    fun sayHello() {
        println("Hello, my name is $name.")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance() = PersonKt()
        fun getInstance(name: String) = PersonKt(name)
        fun getInstance(name: String, age: Int) = PersonKt(name, age)
        fun getInstance(other: PersonKt) = PersonKt(other.name, other.age)
    }














}