package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {


    @DisplayName("deveria reajustar salario")
    @ParameterizedTest
    @CsvSource({"A_DESEJAR, 1030.00", "BOM, 1150.00", "MUITO_BOM, 1200.00", "ESPETACULAR, 1300.00"})
    void test01(Desempenho input, String output) {
        var service = new ReajusteService();
        var funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"), input);
        service.reajustarSalario(funcionario);

        assertEquals(new BigDecimal(output), funcionario.getSalario());

    }
}

