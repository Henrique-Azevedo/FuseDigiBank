package dio.fusedigibank

class Pessoa {

    var nome: String = "Henrique"
    var cpf: String = "123.123.123.11"


}

fun main(){

    val henrique = Pessoa()

    println(henrique.nome)
    println(henrique.cpf)
}

