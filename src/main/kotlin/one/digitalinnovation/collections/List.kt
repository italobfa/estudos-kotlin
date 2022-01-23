package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("Joao Felipe", 10000.0, "PJ")
    val carlos = Funcionario ("Carlos Jose", 2500.0, "CLT")
    val lucas = Funcionario ("Lucas Claro", 3200.0, "PJ")
    val maria = Funcionario ("Maria Julia", 8200.0, "CLT")

    val funcionarios = listOf(joao, carlos, lucas, maria)

    funcionarios.forEach { println(it) }
    println("------------------")
    println( funcionarios.any { it.nome == "Joao Felipe" })
    println("------------------")
    println( funcionarios.find { it.nome == "Joao Felipe" })
    println("------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("------------------")
    funcionarios.groupBy { it.contrato }.forEach{ println(it) }

}

