package com.stefanini.aprendendocomeclipse.aula12;

public class SwitchCase {
	public static void main(String[] args) {
		int mes = 13;
		
		if (mes == 1) {
			System.out.println("janeiro");
		}else if (mes == 2) {
			System.out.println("fevereiro");
		}else if (mes == 3) {
			System.out.println("março");
		}else if (mes == 4) {
			System.out.println("abril");
		}else if (mes == 5) {
			System.out.println("maio");
		}else if (mes == 6) {
			System.out.println("junho");
		}else if (mes == 7) {
			System.out.println("julho");
		}else if (mes == 8) {
			System.out.println("agosto");
		}else if (mes == 9) {
			System.out.println("setembro");
		}else if (mes == 10) {
			System.out.println("outubro");
		}else if (mes == 11) {
			System.out.println("novembro");
		}else if (mes == 12) {
			System.out.println("dezembro");
		}else {
			System.out.println("mês invalido");
		} 
		
		
		
		
		switch(mes) {
		case 1 :System.out.println("janeiro");
		break;
		case 2 :System.out.println("fevereiro");
		break;
		case 3 :System.out.println("março");
		break;
		case 4 :System.out.println("abril");
		break;
		case 5 :System.out.println("maio");
		break;
		case 6 :System.out.println("junho");
		break;
		case 7 :System.out.println("julho");
		break;
		case 8 :System.out.println("agosto");
		break;
		case 9 :System.out.println("setembro");
		break;
		case 10 :System.out.println("outubro");
		break;
		case 11 :System.out.println("novembro");
		break;
		case 12 :System.out.println("dezembro");
		break;
		default :System.out.println("mês inválido");
		break;
		}
		
	}
	

}
