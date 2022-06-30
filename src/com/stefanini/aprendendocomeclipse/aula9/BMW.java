package com.stefanini.aprendendocomeclipse.aula9;

public class BMW extends Carro  {
	@Override
	public double calcularTaxaAceleracao( double velocidadeFinal, double tempoFinal) {
		System.out.println("sobrescrita");
		return velocidadeFinal/tempoFinal;
	}

}
