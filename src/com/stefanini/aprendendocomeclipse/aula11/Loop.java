package com.stefanini.aprendendocomeclipse.aula11;

public class Loop {
	public static void main(String[] args) {
		//while
		int count = 101;
		while (count<100){
			System.out.println("count" + count);
			count++;
		}
		
		
		//do while
		int countDois = 101;
		do{
			System.out.println("count" + countDois);
			count++;
		}while (count<100);
		
		//for normal 		for (area de atribuição; condição; alteração
		for(int i= 0;i<100; i++) {
			System.out.println(i);
		}
		//  for de areas ausentes
		int i= 0;
		for(;i<100;) {
			System.out.println(i);
			i++;
		}
		
	//  for de todas as areas ausentes
			for(;;) {
				System.out.println("a");
			}
	}

}
