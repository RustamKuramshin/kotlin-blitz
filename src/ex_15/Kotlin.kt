package ex_15

fun main() {

    val name: String? = "John"

    name?.let {
        println("variable not null")
    }

    println(name?.length ?: "empty")
}