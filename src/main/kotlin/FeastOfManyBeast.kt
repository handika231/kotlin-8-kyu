fun main() {
    val name: String = "Hello"
    val result = name[0]
    println(result)
}


fun feast(beast: String, dish: String): Boolean {
//your function here
    val firstBeast = beast[0]
    val lastBeast = beast[beast.length - 1]
    val firstDish = dish[0]
    val lastDish = dish[dish.length - 1]
    return firstBeast == firstDish && lastBeast == lastDish
}