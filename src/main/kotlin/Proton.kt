import java.math.BigDecimal

//Zadanie 5
class Proton: ElementaryParticle {
    override fun mass(): Double = BigDecimal("1.67e-27").toDouble()

    override fun charge(): Double = 0.5

    override fun spin(): Double = 0.5
}