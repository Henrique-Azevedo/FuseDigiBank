package dio.fusedigibank.testes

import dio.fusedigibank.Analista
import dio.fusedigibank.Funcionario
import dio.fusedigibank.Gerente
import dio.fusedigibank.Pessoa
import dio.fusedigibank.testes.ImprimeRelatorioFuncionario.Companion.imprime

fun  main() {

    val rafaela = Gerente("rafaela", "567.567.567.22", 10000.00)
    imprime(rafaela)
}
