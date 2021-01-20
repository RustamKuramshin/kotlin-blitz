package ex_14

fun main() {

    val map = mapOf("zero" to 0, "one" to 1, "two" to 2)

    for ((k, v) in map) {
        println("$k:$v")
    }
}