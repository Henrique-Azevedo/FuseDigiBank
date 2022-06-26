package dio.fusedigibank.testes

import dio.fusedigibank.Analista
import dio.fusedigibank.Funcionario
import dio.fusedigibank.Pessoa
import dio.fusedigibank.testes.ImprimeRelatorioFuncionario.Companion.imprime

fun  main() {

    val joao = Analista("Joao", "789.586.985.11", 5000.00)
    imprime(joao)
}

