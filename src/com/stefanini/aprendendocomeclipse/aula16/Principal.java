package com.stefanini.aprendendocomeclipse.aula16;

public class Principal {
		static int valor= 10;
		
		static void print() {
			System.out.println(valor);
		}
		
	public static void main(String[] args) {
		valor = 11;
		print();
		/*
		Carro bmw = new Carro();
		bmw.taxaAceleração = 60;
		bmw.velocidaMaxima = 300;
		bmw.kmPL = 6.6;
		bmw.marca = "BMW";
		bmw.modelo = "320i";
		
		System.out.println(bmw.marca);	
		System.out.println(bmw.modelo);
		System.out.println(bmw.taxaAceleração);
		System.out.println(bmw.kmPL);	
		System.out.println(bmw.velocidaMaxima);
		*/
		Carro bmw = new Carro();
		bmw.setTaxaAceleração(60);
		bmw.setVelocidaMaxima(300);
		bmw.setKmPL(6.6);
		bmw.setMarca("BMW");
		bmw.setModelo("320i");
		
		Carro mercedes = new Carro("mercedes","i180");
		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		System.out.println(mercedes.getTaxaAceleração());
		
		System.out.println(bmw.getMarca());	
		System.out.println(bmw.getModelo());
		System.out.println(bmw.getTaxaAceleração());
		System.out.println(bmw.getKmPL());	
		System.out.println(bmw.getVelocidaMaxima());
		
		BMW bmwdois = new BMW();
		System.out.println(bmwdois.calcularTaxaAceleracao(100.0, 12.0));
		
		Tesla tesla = new Tesla();
		
		Carro teslaDois = new Tesla();
		tesla.isDirigeSozinho();
		((Tesla) teslaDois).setDirigeSozinho(true);// Casting
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		
		Carro[] carros = new Carro[] {bmw, bmwdois, tesla, teslaDois};
		
		for (Carro carro : carros) {
			if(Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de Marca Famosa");
			}
			if (carro instanceof  Tesla) {
				System.out.println(((Tesla)carro).isDirigeSozinho());
			}
		}
		
		Calcular.soma(10, 13);
		
		
		
		//Constantes.MARCA_FAMOSA = "Porshe";
		
			
		bmwdois.calcularTaxaAceleracao(100.1, 10.0)	;
		tesla.calcularTaxaAceleracao(100.0, 10.0);
		
		
		bmw.acelerar();
		bmw.frear();
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidaMaxima(), 0, 10, 0));
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidaMaxima(), 10));

	}

}
