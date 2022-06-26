package dio.fusedigibank

abstract class Funcionario(
    nome: String,
    cpf: String,
    var salario: Double
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        salario: $salario
        auxilio: ${calculoAuxilio()}
    """.trimIndent()
}