package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(8, 4, 5 , 1, 10, 9, 34)

    values.forEach {
        println(it)
    }

    values.sort()

    values.forEach {
        println(it)
    }
}