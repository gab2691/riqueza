package com.riquezinha.model;

public class Funcionario {

	private String nome;
	private String carteiraProfissional;
	

	public Funcionario(String nome, String carteiraProfissional) {
		this.nome = nome;
		this.carteiraProfissional = carteiraProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCarteiraProfissional() {
		return carteiraProfissional;
	}

	public void setCarteiraProfissional(String carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}

	public float calculaSalario(){
		float salario = 0;
		return salario * 3;  
	}
}
