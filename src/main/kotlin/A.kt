//Zadanie 9
class A(var a: Int = 1) : AInterface {
    init {
        a = 2
    }

    override fun b(){
        a = 3
    }

    override fun add(b:Int) = a + b
    override fun mult(b: Int) = a * b
}