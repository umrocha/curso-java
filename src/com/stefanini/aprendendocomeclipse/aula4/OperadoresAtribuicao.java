package com.stefanini.aprendendocomeclipse.aula4;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		
		b-=a;// operador subtração
		//b= b - a;
		b+=a;// op. adição
		b*=a;// op. multiplicação
		b/=a;// op. divisão
		b%=a;// op. modular
		
		System.out.println(b);
	}
}
