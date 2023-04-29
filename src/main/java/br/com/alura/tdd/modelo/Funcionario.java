package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	private Desempenho desempenho;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario, Desempenho desempenho) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.desempenho = desempenho;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public Desempenho getDesempenho() {
		return desempenho;
	}

	public void reajustarSalrio(BigDecimal reajuste) {
		salario = salario.add(reajuste);

	}
}
