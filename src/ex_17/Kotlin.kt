package ex_17

class Kotlin(val name: String, val age: Int) {
    init {
        println("init block")
    }
}

fun main() {
    val k1 = Kotlin("John", 30)
    println("Instance created")
}