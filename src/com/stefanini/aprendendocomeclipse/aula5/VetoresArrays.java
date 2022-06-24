package com.stefanini.aprendendocomeclipse.aula5;

import java.util.Iterator;

public class VetoresArrays {
	public static void main(String[] args) {
		int[] notas = new int [10];
		notas [0] = 4;
		notas [3] = 9;
		
		int[][] matriz = new int[5][5];
		
		matriz [0][1] = 5;
		matriz [2][4] = 10;
		matriz [3][2] = 15;
		
		for ( int[] m: matriz) {
			for ( int v: m) {
				System.out.println(v);
			}
		}
		
		String[] meses = new String[] {"Janeiro", "Fevereiro", "Março"};
		System.out.println(meses.length);
		for ( String m : meses) {
			System.out.println(m);
			
		}
	}
}
