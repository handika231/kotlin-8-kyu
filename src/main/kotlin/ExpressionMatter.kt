fun main() {

}

class Kata {
    companion object {
        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            return maxOf(a * b * c, a * (b + c), (a + b) * c, a + b + c)
        }
    }
}