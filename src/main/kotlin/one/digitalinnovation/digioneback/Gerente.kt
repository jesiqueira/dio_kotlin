package one.digitalinnovation.digioneback

class Gerente (name: String, cpf: String, salario: Double) : Funcionario(name, cpf, salario) {
    override fun calculaAuxilio(): Double = salario * 0.4
}