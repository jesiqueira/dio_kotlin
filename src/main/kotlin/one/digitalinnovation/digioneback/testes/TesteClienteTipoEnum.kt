package one.digitalinnovation.digioneback.testes

import one.digitalinnovation.digioneback.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
         println("${elemento.name} - ${elemento.descricao}")
    }
    //imprime a mesma coisa que função anterior
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")

}