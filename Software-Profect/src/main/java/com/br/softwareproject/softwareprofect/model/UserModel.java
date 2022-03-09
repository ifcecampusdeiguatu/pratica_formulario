package com.br.softwareproject.softwareprofect.model;

public class UserModel {
	private String nome;
	private int idade;
	
	public UserModel () {
		
	}


	public UserModel(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

}
