package com.riquezinha.model;

import com.riquezinha.Interfaces.ImprimirDados;

public class Comissionado extends Funcionario implements ImprimirDados{

	private float valorComissao;
	private float salario;
	

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(float valorComissao) {
		this.valorComissao = valorComissao;
	}

	public Comissionado(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
	}
	
	public float calculaSalario(float salario, float comissao){
		return this.salario += salario + comissao;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Comissionado [nome=" + this.getNome() + ", salario=" + this.salario + "]");
	}

}
