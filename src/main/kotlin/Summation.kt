object GrassHopper {
    fun summation(n: Int): Int {
        var results = 0
        for (i in 1..n) {
            results += i
        }
        return results
    }
}