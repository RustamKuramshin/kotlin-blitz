package ex_2

class Kotlin(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main() {
    Kotlin("John").greet()
}