package com.stefanini.aprendendocomeclipse.aula11;

public class IfElse {
	public static void main(String[] args) {
		int idade = 18;
		
		if (idade>= 18) {
			System.out.println("maior de idade");
		}
		
		if (idade>= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}
		
		
		if (idade>= 100) {
			System.out.println("mumia");
		} else if (idade>= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}
		
		if (idade>= 18)  System.out.println("maior de idade");
		
		System.out.println("sua idade é" + idade);
	}

}
