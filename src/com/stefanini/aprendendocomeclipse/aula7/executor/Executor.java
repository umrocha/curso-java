package com.stefanini.aprendendocomeclipse.aula7.executor;

import com.stefanini.aprendendocomeclipse.aula7.Carro;
import com.stefanini.aprendendocomeclipse.aula7.entidade.BMW;
import com.stefanini.aprendendocomeclipse.aula7.entidade.Ferrari;

public class Executor  {
	public static void main(String[] args) {
		/*
		Carro carro1 = new Carro();
		carro1.bancos = 5;
		carro1.chassi = 8888888;
		carro1.placa = "A1A1A1A";
		carro1.rodas = 28;
		carro1.marca = "BMW";
		carro1.modelo = "320i";
		
		System.out.println(carro1.marca);	
		System.out.println(carro1.rodas);
		System.out.println(carro1.placa);
		System.out.println(carro1.modelo);
		System.out.println(carro1.chassi);
		System.out.println(carro1.bancos);	
		
		System.out.println("\n");
		
		Carro carro2 = new Carro();
		carro2.bancos = 5;
		carro2.chassi = 74677384;
		carro2.placa = "F1F1F1F";
		carro2.rodas = 26;
		carro2.marca = "Ferrari";
		carro2.modelo = "480";
		
		System.out.println(carro2.marca);	
		System.out.println(carro2.rodas);
		System.out.println(carro2.placa);
		System.out.println(carro2.modelo);
		System.out.println(carro2.chassi);
		System.out.println(carro2.bancos);	
		*/
		Carro carro1 = new Carro();
		carro1.setBancos(5);
		carro1.setChassi(8888888);
		carro1.setPlaca("A1A1A1A");
		carro1.setRodas(28);
		carro1.setMarca("BMW");
		carro1.setModelo("320i");
		
		carro1.setVelocidade(200);
		
		System.out.println(carro1.getMarca());	
		System.out.println(carro1.getRodas());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getBancos());	
		System.out.println(carro1.acelerar());
		
		System.out.println("\n");
		System.out.println(soma(10,44));
		System.out.println(soma(2,55,34));
		System.out.println("\n");
		
		BMW bmw = new BMW();
		bmw.setVelocidade(120);
		System.out.println(bmw.acelerar());
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.acelerar());
			
		
		System.out.println("\n");
		
		
		Carro carro2 = new Carro();
		carro2.setBancos(5);
		carro2.setChassi(74677384);
		carro2.setPlaca("F1F1F1F");
		carro2.setRodas(26);
		carro2.setMarca("Ferrari");
		carro2.setModelo("480");
		
		System.out.println(carro2.getMarca());	
		System.out.println(carro2.getRodas());
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getChassi());
		System.out.println(carro2.getBancos());	

	}
	
	public static int soma(int a, int b){
		return a+b;
	}
	public static int soma(int a, int b, int c){
		return a+b+c;
	}

}
