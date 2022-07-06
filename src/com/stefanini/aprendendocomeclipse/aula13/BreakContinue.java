package com.stefanini.aprendendocomeclipse.aula13;

public class BreakContinue {
	public static void main(String[] args) {
		
		String[] lista = new String[] {"um", "dois", "três", "quatro", "cinco"};
		
		for( int i = 0; i<lista.length; i++) {
			if (lista[i] == "três")	{
				System.out.println("N." + lista[i]);
				//break;
				continue;
			}
			System.out.println("número: ");
			System.out.println(lista [i]);
		}
		
		
	}

}
