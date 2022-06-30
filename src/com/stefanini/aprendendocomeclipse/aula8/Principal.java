package com.stefanini.aprendendocomeclipse.aula8;

public class Principal {
	public static void main(String[] args) {
		Carro bmw = new Carro();
		bmw.taxaAceleração = 60;
		bmw.velocidaMaxima = 300;
		bmw.kmPL = 6.6;
		bmw.marca = "BMW";
		bmw.modelo = "320i";
		
		System.out.println(bmw.marca);	
		System.out.println(bmw.modelo);
		System.out.println(bmw.taxaAceleração);
		System.out.println(bmw.kmPL);	
		System.out.println(bmw.velocidaMaxima);
		
		bmw.acelerar();
		bmw.frear();

	}

}
