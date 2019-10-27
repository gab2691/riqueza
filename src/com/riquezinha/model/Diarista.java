package com.riquezinha.model;

import com.riquezinha.Interfaces.ImprimirDados;

public class Diarista extends Funcionario implements ImprimirDados {

	private float valorDia;
	private int qtDias;

	public Diarista(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
	}

	public float getValorDia() {
		return valorDia;
	}

	public void setValorDia(float valorDia) {
		this.valorDia = valorDia;
	}

	public int getDias() {
		return qtDias;
	}

	public void setDias(int dias) {
		this.qtDias = dias;
	}

	@Override
	public float calculaSalario() {
		return this.valorDia * this.qtDias;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Diarista [nome=" + this.getNome() + ", salario=" + this.calculaSalario() + "]");
	}

}
