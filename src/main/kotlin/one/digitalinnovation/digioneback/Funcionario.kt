package one.digitalinnovation.digioneback

import java.math.BigDecimal

abstract class Funcionario(name: String,  cpf: String, val salario: Double) : Pessoal(name, cpf){
    protected abstract  fun calculaAuxilio() : Double

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculaAuxilio()}
    """
}