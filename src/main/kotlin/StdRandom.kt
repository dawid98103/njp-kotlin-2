import kotlin.math.floor

//Zadanie 7
class StdRandom: RandomNumberGenerator {
    override fun rnd(minInt: Int, maxInt: Int): Int {
        val span = maxInt - minInt + 1;
        return minInt + floor (Math.random () * span).toInt()
    }
}