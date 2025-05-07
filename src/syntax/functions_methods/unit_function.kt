package syntax.functions_methods

fun main() {

    var multiply:(Int,Int) -> Unit = { a, b -> print(a*b)}
    multiply(2,2)

}