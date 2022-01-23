package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("Joao Felipe", 10000.0, "PJ")
    val carlos = Funcionario ("Carlos Jose", 2500.0, "CLT")
    val lucas = Funcionario ("Lucas Claro", 3200.0, "PJ")
    val maria = Funcionario ("Maria Julia", 8200.0, "CLT")

    val funcionarios1 = setOf(joao, lucas)
    val funcionarios2 = setOf(carlos, maria)

    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach{ println(it) }
    println("------------------")
    val funcionarios3 = setOf(joao,carlos,maria)
    val subtracao = funcionarios3.subtract(funcionarios2)
    subtracao.forEach{ println(it) }
    println("------------------")
    val intercesao = funcionarios1.intersect(funcionarios3)
    intercesao.forEach{ println(it) }
    println("------------------")
    println("------------------")
}