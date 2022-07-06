package com.stefanini.aprendendocomeclipse.aula12;

public class IfElse {
	public static void main(String[] args) {
		
		
		int nota = 7;
		//if 
		if(nota>= 7) {
			System.out.println("aprovado");
		}
		
		//if sem bloco
		if(nota>= 7) 
			System.out.println("aprovado");
		
		//if else
		if(nota>= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		//if else if
		if(nota>= 9) {
			System.out.println("Parabens");
			System.out.println("aprovado");
		} if(nota>= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}	
	
	}
	

}
