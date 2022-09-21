fun main() {
    val coba = reverseSeq(5)
    println(coba)
}

fun reverseSeq(n: Int): List<Int> {
//    return (1..n).toList().reversed()
    return (n downTo 1).toList()
}