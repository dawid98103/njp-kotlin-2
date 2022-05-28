//Zadanie 3
class Triangle(val a: Double, val height: Double) {
    companion object {
        const val NUMBER_OF_CORNERS = 3
    }

    fun info() {
        print("Corners: $NUMBER_OF_CORNERS")
    }
}