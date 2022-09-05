object Solution {
    fun areaOrPerimeter(l: Int, w: Int): Int {
        return if (l == w) l * w else 2 * (l + w)
    }
}