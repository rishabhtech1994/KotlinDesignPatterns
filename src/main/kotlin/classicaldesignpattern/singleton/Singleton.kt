package classicaldesignpattern.singleton

object Singleton{
    init {
        println("Singleton called")
    }
    val name = "My name is Rishabh"
    fun add( num: Int , num1: Int): Int{
        return  num + num1
    }
}

fun main() {
    println("Singleton ${Singleton.name}")
    println("add called ${Singleton.add(5, 10)}")
    println("add called ${Singleton.add(30, 50)}")

}