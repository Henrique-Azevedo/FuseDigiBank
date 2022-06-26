package dio.fusedigibank.testes

import dio.fusedigibank.Gerente
import dio.fusedigibank.testes.ImprimeRelatorioFuncionario.Companion.imprime

fun  main() {
    val rafaela = Gerente("rafaela", "567.567.567.22", 10000.00, "senha123")

    ImprimeRelatorioFuncionario.imprime(rafaela)

    TesteAutenticacao().autentica(rafaela)

}
