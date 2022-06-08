package one.digitalinnovation.digioneback

class Cliente(name: String, cpf: String, val clienteTipo: ClienteTipo, val senha: String) : Pessoal(name, cpf), Logavel {
    override fun login(): Boolean = "1233" == senha

    override fun toString(): String  = """
        Nome: $name
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}