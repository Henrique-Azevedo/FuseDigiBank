package dio.fusedigibank.testes

import dio.fusedigibank.Funcionario
import dio.fusedigibank.Pessoa
import java.math.BigDecimal

fun  main() {
    val henrique = Pessoa(nome = "Henrique", cpf = "123.456.789-00")
    println(henrique.nome)
    println(henrique.cpf)

    val joao = Funcionario("Joao", "789.586.985.11", BigDecimal.valueOf(5000.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}