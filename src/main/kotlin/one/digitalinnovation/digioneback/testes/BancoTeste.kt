package one.digitalinnovation.digioneback.testes

import one.digitalinnovation.digioneback.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

//    ou
    println(digiOneBank.info())
}
