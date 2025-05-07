package syntax.functions_methods

fun main() {
    println(getSumOfNumbers(9))
    print(getSumOfTwoNumbers(10, 9))
}

fun getSumOfNumbers(number: Long):Long {
    var count = 0
    var sum = 0L
    while (count <= number) {
        sum += count
        count++
    }
    return sum
}

fun getSumOfTwoNumbers(a: Int, b: Int): Long {
    return (a + b).toLong()
}
fun getSumOfTwoNumbers2(a: Int, b: Int) = (a + b).toLong() //то же самое что и сверху












