package com.stefanini.aprendendocomeclipse.aula3;


public class Vetores {
	public static void main(String[] args) {
		int[] notas = new int[10];
		// forma 1 de atribuir valor
		notas[2] = 6;
		notas[0] = 8;
		notas[3] = 3;
		notas[1] = 7;
		notas[8] = 4;
		notas[5] = 9;
		//forma 2 de atribuir valor
		String[] carros = new String[] {"Mercedes", "BMW", "Ford", "Ferrari"};
		System.out.println(carros.length);
		
		for (int i = 0; i<notas.length; i++) {
			System.out.println(notas[i]);
			
		}
		
		//DESAFIO MATRIZ
		//Matriz unidimensional
		int[] num = new int[5];
		for(int i : num) {
		System.out.println(num);
		}
		//matriz multidimensional
		//int[][] matM = new int[5][2];//declaração
		int[][] matM = { {1,2}, {1,2}, {1,2}, {1,2}, {1,2} };//declaração com valores.
		for(int[] a : matM) {
			for( int b :a) {
				System.out.println(matM);
			}
		}
		
		
	}

}
