package syntax.Arrays

fun main() {
    val arrNums = arrayOf(1,2,3,4,5)
    val arrNums2:Array <Int> = arrNums.copyOf()

    val arrNums3 = IntArray(arrNums2.size)
    arrNums3[0] = 1
    arrNums3[1] = 2
    arrNums3[2] = 3
    arrNums3[3] = 4
    arrNums3[4] = 5

    println("the size of array is ${arrNums3.size}")

    for(num in arrNums3){
        print("$num ")
    }









}