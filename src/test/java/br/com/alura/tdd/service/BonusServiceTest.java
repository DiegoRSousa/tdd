package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService bonusService;
    private Funcionario funcionario;

    @BeforeEach
    void setup(){
        bonusService = new BonusService();
    }

    @Test
    @DisplayName("deveria ser zero para funcionario com salário muito alto")
    void test01() {
        funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("10500"), Desempenho.A_DESEJAR);

        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionario));

    }

    @Test
    @DisplayName("deveria ser 10 por cento do salario")
    void test02() {
        funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("8000"), Desempenho.A_DESEJAR);
        var bonus = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("800.00"), bonus);
    }

    @Test
    @DisplayName("deveria ser 10 por cento quando salario igual a 10000")
    void test03() {
        funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("10000"), Desempenho.A_DESEJAR);
        var bonus = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}