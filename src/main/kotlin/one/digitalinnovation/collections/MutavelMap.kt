package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("Joao Felipe", 10000.0, "PJ")
    val carlos = Funcionario ("Carlos Jose", 2500.0, "CLT")
    val lucas = Funcionario ("Lucas Claro", 3200.0, "PJ")
    val maria = Funcionario ("Maria Julia", 8200.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(carlos.nome, carlos)
    repositorio.create(lucas.nome, lucas)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println("------------------")
    repositorio.findAll().forEach { println(it) }
    println("------------------")
    repositorio.remove(carlos.nome)
    repositorio.findAll().forEach { println(it) }
    println("------------------")
    println("------------------")
}