package ex_3

data class Kotlin(val name: String, val age: Int)

fun main() {
    println("${Kotlin("John", 30)}")
    println("${Kotlin("John", 30) == Kotlin("John", 30)}")
}