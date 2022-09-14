fun main() {
    val coba = points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"))
    println(coba)
}

fun points(games: List<String>): Int {
    // Enter the logic here!
    var points = 0
    for (i in games) {
        points += if (i[0] > i[2]) {
            3
        } else if (i[0] == i[2]) {
            1
        } else {
            0
        }
    }
    return points
}

//Nice Answer
//fun points(games: List<String>) =
//    games.sumBy {
//        val (x, y) = it.split(":")
//        when {
//            x > y -> 3
//            x < y -> 0
//            else -> 1
//        }
//    }