package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)//necessario passar a capacidade do array

    values[0] = 1
    values[1] = 9
    values[2] = 2
    values[3] = 7
    values[4] = 3

    for (valor in values){
        println(valor)
    }
    println("-------------------------------------------")
    values.forEach {
        println(it)
    }
    println("-------------------------------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}