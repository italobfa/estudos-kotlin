package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Paulo"
    nomes[1] = "Pedro"
    nomes[2] = "Lucas"

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes1 = arrayOf("ZaZa", "Alice", "Joao")

    nomes1.sort()
    nomes1.forEach { println(it) }
}