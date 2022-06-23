package dio.fusedigibank.testes

import dio.fusedigibank.Banco

fun main(){

    val fuseDigiBank = Banco(nome = "FuseDigi", numero = 13)

    println(fuseDigiBank.nome)
    println(fuseDigiBank.numero)


    val banco2 = fuseDigiBank.copy(nome = "banco2")

    println(banco2.info())

}
