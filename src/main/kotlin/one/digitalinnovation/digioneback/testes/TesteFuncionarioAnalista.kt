package one.digitalinnovation.digioneback.testes

import one.digitalinnovation.digioneback.Analista
import one.digitalinnovation.digioneback.Funcionario
import java.math.BigDecimal


fun main(){
    val luis = Analista(name = "Luis", cpf = "123.123.123-77", salario = 5000.2)

    ImprimirRelatorioFuncionario.imprimirRelatorio(luis)
}

