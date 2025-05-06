package syntax.scanner_lesson

import java.util.Scanner

fun main() {

    val scanner: Scanner = Scanner(System.`in`)

    print("name: ")
    val name = scanner.nextLine()

    print("age: ")
    val age = scanner.nextInt()

    print("my name is $name, and the age is $age")

}