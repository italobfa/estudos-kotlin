package one.digitalinnovation.collections

fun main() {
    val salario = doubleArrayOf(100.0, 200.0, 500.0)
    val salario1 = DoubleArray(3)

    salario1[0] = 100.0
    salario1[1] = 200.0
    salario1[2] = 500.0

    for(valor in salario.indices){
        println(salario[valor] * 1.1)
    }
    println("--------------------------------")
    salario.forEachIndexed { index, valor ->
        salario[index] = valor * 1.1
    }

    salario.forEach { println(it) }

}



