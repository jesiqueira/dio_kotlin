package one.digitalinnovation.digioneback

import java.math.BigDecimal

class Analista (name: String, cpf: String, salario: Double) : Funcionario(name, cpf, salario) {
    override fun calculaAuxilio()  = salario * 0.1
}