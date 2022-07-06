package com.stefanini.aprendendocomeclipse.aula16;
/*MODIFICADORES DE ACESSO
 * default		não tem palavra chave(palavra reservada).
 * 				Acessível pela própria classe ou uma do mesmo pacote
 * public		Acessível pela própria classe, classe do mesmo pacote, 
 * 				sub classes(extends), todas as demais classes
 * private		Acessível pela própria classe
 * protected	Acessível pela própria classe, classe do mesmo pacote e subclasses (extends)
 * 
 * 
 * */

public class Carro {
	private String marca;
	private String modelo;
	private int taxaAceleração;
	private int velocidaMaxima;
	private double  kmPL;
	
	
	public Carro() {
		System.out.println("Construindo Carro");
	}
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTaxaAceleração() {
		return taxaAceleração;
	}
	public void setTaxaAceleração(int taxaAceleração) {
		this.taxaAceleração = taxaAceleração;
	}
	public int getVelocidaMaxima() {
		return velocidaMaxima;
	}
	public void setVelocidaMaxima(int velocidaMaxima) {
		if (velocidaMaxima < 0) {
			System.out.println("valor invalido");
		}
		this.velocidaMaxima = velocidaMaxima;
	}
	public double getKmPL() {
		return kmPL;
	}
	public void setKmPL(double kmPL) {
		this.kmPL = kmPL;
	}
	void acelerar() {
		System.out.println("acelerando....");
	}
	void frear() {
		System.out.println("freando.......");
	}
	
	public double calcularTaxaAceleracao( double velocidadeFinal, double velocidadeInicial, 
			double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial)/(tempoFinal-tempoInicial) * 3.6;
	}
	
	public double calcularTaxaAceleracao( double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0)/(tempoFinal-0) * 3.6;
	}
	public String calcularTaxaAceleracao( int velocidadeFinal, int tempoFinal) {
		return "" + (velocidadeFinal - 0)/(tempoFinal-0) * 3.6;
	}
}
