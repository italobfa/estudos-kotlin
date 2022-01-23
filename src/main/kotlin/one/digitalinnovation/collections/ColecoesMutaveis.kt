package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("Joao Felipe", 10000.0, "PJ")
    val carlos = Funcionario ("Carlos Jose", 2500.0, "CLT")
    val lucas = Funcionario ("Lucas Claro", 3200.0, "PJ")
    val maria = Funcionario ("Maria Julia", 8200.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }
    println("------------------")
    funcionarios.add(carlos)
    funcionarios.forEach{ println(it) }
    println("------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }
    println("------------------")
    println("------------------")
    println("------------------")
}