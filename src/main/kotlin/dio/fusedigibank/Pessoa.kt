package dio.fusedigibank

class Pessoa {
    var nome: String = "Henrique"
    var cpf: String = "123.123.123.11"
    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val henrique = Pessoa()

    println(henrique.pessoaInfo())
}

