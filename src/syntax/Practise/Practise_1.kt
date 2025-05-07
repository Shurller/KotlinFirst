package syntax.Practise

fun main() {
    var a = 2
    var b = 3
    var c = 19
    var d = 19
    println("${getWinner(a,b,c,d)} is winner")
    println(getWinnerString(a,b,c,d))
}

fun getWinner(a:Int, b:Int, c:Int, d:Int): Int{
    return maxOf(a,b,c,d)
}
fun getWinnerString(a:Int, b:Int, c:Int, d:Int): String{
    val winner = maxOf(a,b,c,d)
    return if (winner == a){
        "puf"
    } else if (winner == b){
        "grif"
    } else if (winner == c){
        "sliz"
    } else {
        "waf"}
}








