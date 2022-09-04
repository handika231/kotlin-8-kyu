import kotlin.math.absoluteValue

fun main() {

}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    // your code here
  val result =  (sonYearsOld * 2 ) - dadYearsOld
    return result.absoluteValue
}

//BEST SOLUTION
//fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int = Math.abs(dadYearsOld - (sonYearsOld * 2))
