import java.math.BigDecimal

//Zadanie 5
class Electron: ElementaryParticle {
    override fun mass(): Double = BigDecimal("9.11e-31").toDouble()

    override fun charge(): Double = -1.0

    override fun spin(): Double = 0.5
}