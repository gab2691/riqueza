package com.riquezinha.model;

import com.riquezinha.Interfaces.ImprimirDados;

public class Mensalista extends Funcionario implements ImprimirDados {

	private float salario;
	private int diasFaltosos;

	public Mensalista(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
		// TODO Auto-generated constructor stub
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getDiasFaltosos() {
		return diasFaltosos;
	}

	public void setDiasFaltosos(int diasFaltosos) {
		this.diasFaltosos = diasFaltosos;
		this.setSalario(this.salario / diasFaltosos);		
	}

	@Override
	public void imprimirDados() {
		System.out.println("Mensalista [nome=" + this.getNome() + ", salario=" + this.salario + "]");
	}

}
