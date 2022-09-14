import kotlin.math.ceil

fun main() {
    val coba = century(2000)
    println(coba)
}

fun century(number: Int): Int {
    return ceil(number / 100.0).toInt()
}