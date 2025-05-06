package syntax.scanner_lesson

fun main() {

    print("name: ")
    val name = readLine()

    print("age: ")
    val age: Int = readLine()?.toIntOrNull() ?: 0

    print("my name is $name, and the age is $age")
}