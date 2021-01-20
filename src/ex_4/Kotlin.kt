package ex_4

fun main() {

    val list = arrayListOf(-1, -2, -3, 1, 2, 3)

    val listPos = list.filter { it > 0 }

    listPos.forEach { println(it) }
}