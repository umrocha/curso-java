package com.stefanini.aprendendocomeclipse.aula17;

public class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, int idade) {
		this.idade= idade;
		this.nome = nome;
		
	}
	
	public Pessoa() {
		
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
