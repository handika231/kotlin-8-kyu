import kotlin.math.abs

fun elevator(left: Int, right: Int, call: Int): String {
    // code here
    return if (abs(call - left) < abs(call - right)) "left" else "right"
}