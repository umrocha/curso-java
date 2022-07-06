package com.stefanini.aprendendocomeclipse.aula14;

public class BMW extends Carro  {
	
	public BMW() {
		super();
		
	}
	
	
	@Override
	public double calcularTaxaAceleracao( double velocidadeFinal, double tempoFinal) {
		System.out.println("sobrescrita bmw");
		return velocidadeFinal/tempoFinal;
	}

}
