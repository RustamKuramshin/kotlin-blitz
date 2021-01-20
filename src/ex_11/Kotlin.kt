package ex_11

fun main() {

    val name: String = "Doe"

    when (name) {
        "John" -> println("John")
        "Doe" -> println("Doe")
        else -> println("Name no match")
    }
}