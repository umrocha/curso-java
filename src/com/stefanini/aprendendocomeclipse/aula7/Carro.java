package com.stefanini.aprendendocomeclipse.aula7;

public class Carro {
	private String marca;
	private String modelo;
	private int chassi;
	private String placa;
	private int rodas;
	private int bancos;
	
	private int velocidade;
	
	public Carro() {
		System.out.println("construindo um carro");
	}
 	public Carro(String marca) {
 		this.marca = marca;
 		
 	}
	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

//
	public String acelerar() {
		return velocidade + "km/5s";
	}
	
	
	public int getBancos() {
		return bancos;
	}
	public void setBancos(int bancos) {
		this.bancos = bancos;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
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
	

}
