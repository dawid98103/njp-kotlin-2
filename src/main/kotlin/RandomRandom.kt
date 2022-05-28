import java.util.*

//Zadanie 7
class RandomRandom(val rnd: Random = Random()): RandomNumberGenerator {
    override fun rnd(minInt: Int, maxInt: Int): Int = minInt + rnd.nextInt(maxInt - minInt + 1)
}