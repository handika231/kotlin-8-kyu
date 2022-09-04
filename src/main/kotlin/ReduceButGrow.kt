fun main() {
}

fun grow(arr: IntArray): Int {
    return arr.reduce { acc, i -> acc * i }
}