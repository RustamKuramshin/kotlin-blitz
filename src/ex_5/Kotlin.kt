package ex_5

object Kotlin {
    var companyName: String = "";
}

fun main() {
    Kotlin.companyName = "Jet Brains";
    val k1 = Kotlin;
    val k2 = Kotlin;
    println(k1 == k2)
}