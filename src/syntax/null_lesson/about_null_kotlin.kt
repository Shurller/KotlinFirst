package syntax.null_lesson

fun main() {
    var nullableString: String? = null
    println(nullableString?.length ?: "Null value here") //сработает только если не null
                           // если ?: иначе
    var someString: String? = "dfdd"
    println(someString?.length ?: "Null value here")

    val PI: Double? = null
    println("The PI const is ${PI ?: "3.14"}")
}