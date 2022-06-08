package one.digitalinnovation.digioneback

class Pessoal {
    var name: String = "Edmar"
    var cpf: String = "123.123.123-11"
    private set

    inner class Endereco{
        var rua: String = "Rua Teste"
    }

    constructor()

    fun pessoaInfo() = name + " " + cpf
}
fun main(){
    val edmar = Pessoal()
    edmar.name = "jose"
    //edmar.cpf = "123" Erro modificador private, não posso realizar set somente usar o metodo get
    println(edmar.name)
    println(edmar.cpf)

    println(edmar.Endereco().rua)

    println(edmar.pessoaInfo())
}