package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void reajustarSalario(Funcionario funcionario) {
       var reajuste = funcionario.getSalario().multiply(funcionario.getDesempenho().percentualReajuste());

        funcionario.reajustarSalrio(reajuste);
    }
}
