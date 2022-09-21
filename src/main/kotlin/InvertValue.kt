fun main() {

}

fun invert(arr: IntArray): IntArray {
    // code here
    return  if(arr.isEmpty()) {
        arr
    } else {
        arr.map { it * -1 }.toIntArray()
    }
}