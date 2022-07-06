package com.stefanini.aprendendocomeclipse.aula12;

public class For {
	public static void main(String[] args) {
		//for normal 		for (area de atribuição; condição; alteração
		for(int i= 0;i<10; i++) {
			System.out.println(i);
		}
		for(int i= 0, j = 10 ; i<10; i++, j--) {
			System.out.println("i"+i);
			System.out.println("j"+j);
		}
		//  for com apenas condição
		int i= 0;
		for(;i<10;) {
			System.out.println(i);
			i++;
		}
		// loop infinito
		for(;;) {
			System.out.println("loop");
		}
		
	}
}
