package ex_16

import java.lang.Exception

fun main() {

    val name = try {
        "abc"
    } catch (ex: Exception) {
        "def"
    }

    println(name)
}