package syntax.switch_when

fun getWinner(a:Int, b:Int, c:Int, d:Int):String {
    val maxPoints = maxOf(a,b,c,d)
    when (maxPoints){
        a -> return "grif"
        b -> return "sliz"
        c -> return "raven"
        d -> return "huff"
        else -> return "No winner"
    }
}