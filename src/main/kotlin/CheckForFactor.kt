fun main() {
  checkForFactor(10, 2) // true
}


fun checkForFactor(base: Int, factor: Int): Boolean {
    return base % factor == 0;
}