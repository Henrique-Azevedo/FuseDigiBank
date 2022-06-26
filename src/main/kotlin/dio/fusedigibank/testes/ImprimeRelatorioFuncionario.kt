package dio.fusedigibank.testes

import dio.fusedigibank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}