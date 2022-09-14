fun main() {
    val coba = removeChar("Eloquent")
    println(coba)
}

fun removeChar(str: String): String {
    return str.substring(1, str.length - 1)
}