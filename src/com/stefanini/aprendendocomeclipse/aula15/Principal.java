package com.stefanini.aprendendocomeclipse.aula15;

public class Principal {
	public static void main(String[] args) {
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
		*/
		
		BMW bmwdois = new BMW();
		Carro teslaDois = new Tesla();
		System.out.println(bmwdois.calcularTaxaAceleracao(100.0, 12.0));
		bmwdois.piscarAlerta();
		
		teslaDois.piscarAlerta();

		Tesla tesla = new Tesla();
		
		tesla.isDirigeSozinho();
		((Tesla) teslaDois).setDirigeSozinho(true);// Casting
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		
		Carro[] carros = new Carro[] { bmwdois, tesla, teslaDois};
			for (Carro carro : carros) {
				if (carro instanceof  Tesla) {
					System.out.println(((Tesla)carro).isDirigeSozinho());
				}
			}
			
		bmwdois.calcularTaxaAceleracao(100.1, 10.0)	;
		tesla.calcularTaxaAceleracao(100.0, 10.0);
		
		
	

	}

}
