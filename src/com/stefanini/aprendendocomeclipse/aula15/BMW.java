package com.stefanini.aprendendocomeclipse.aula15;

public class BMW extends Carro implements Conversivel, Utilitario {
	
	public BMW() {
		super();
		
	}
	
	
	@Override
	public double calcularTaxaAceleracao( double velocidadeFinal, double tempoFinal) {
		System.out.println("sobrescrita bmw");
		return velocidadeFinal/tempoFinal;
	}


	@Override
	public void piscarAlerta() {
		System.out.println("Pisca Alerta BMW");
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void acionarTurbo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}

}
