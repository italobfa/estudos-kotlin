package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2220.0, 1800.0, 3580.0, 6000.0, 1500.0)

    for(salario in salarios){
        println(salario)
    }

    println("------------------")
    println("media salarial ${salarios.average()}")
    println("------------------")
    println(salarios.maxOrNull())
    println("------------------")
    println(salarios.minOrNull())
    println("------------------")
    val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }
    salariosMaiorQue2000.forEach{ println(it)}
    println("------------------")
    println(salarios.count { it in 2000.0..5000.0 })//usando range
    println("------------------")
    println(salarios.find { it == 6000.0 })//se verdadeiro retorna o elemento, se falso retorna null
    println("------------------")
    println(salarios.any{it == 1500.0})//retorna true ou false
    println("------------------")

}