package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "3000".toBigDecimal(),
        "1800".toBigDecimal(),
    )

    println(salarios.somatoria())
    println("------------------")
    println(salarios.media())
}

