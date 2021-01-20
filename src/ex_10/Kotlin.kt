package ex_10

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun main() {
    println(getStringLength("abc"))
    println(getStringLength(123))
}