package com.stefanini.aprendendocomeclipse.aula10;

public class Tesla extends Carro{
	public Tesla() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao( double velocidadeFinal, double tempoFinal) {
		System.out.println("sobrescrita tesla");
		return (velocidadeFinal - 0)*(tempoFinal-0);
	}
	
	private boolean dirigeSozinho;

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	

}
