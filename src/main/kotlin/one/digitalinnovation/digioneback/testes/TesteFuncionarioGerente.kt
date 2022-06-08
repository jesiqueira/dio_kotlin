package one.digitalinnovation.digioneback.testes

import one.digitalinnovation.digioneback.Analista
import one.digitalinnovation.digioneback.Funcionario
import one.digitalinnovation.digioneback.Gerente
import java.math.BigDecimal


fun main(){
    val joao = Gerente(name = "Joao", cpf = "123.123.123-77", salario = 15000.2)

    ImprimirRelatorioFuncionario.imprimirRelatorio(joao)
}
