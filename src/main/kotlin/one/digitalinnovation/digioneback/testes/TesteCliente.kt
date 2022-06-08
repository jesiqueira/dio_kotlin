package one.digitalinnovation.digioneback.testes

import one.digitalinnovation.digioneback.Cliente
import one.digitalinnovation.digioneback.ClienteTipo

fun main(){
    val  jose = Cliente("Jose SIqwueira", "123.234.565-12", clienteTipo = ClienteTipo.PF, "123")
    println(jose)

    TesteAutenticacao().autentica(jose)
}