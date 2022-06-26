package dio.fusedigibank.testes

import dio.fusedigibank.Cliente
import dio.fusedigibank.ClienteTipo

fun main() {

    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.123-33",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)


    TesteAutenticacao().autentica(jose)
}