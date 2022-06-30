package com.stefanini.aprendendocomeclipse.aula7.entidade;

import com.stefanini.aprendendocomeclipse.aula7.Carro;

public class BMW extends Carro {
	public BMW() {
		this.setMarca("BMW");
		
		

	}
	@Override
		public String acelerar() {
			return " A BMW pode ir de 0 a "+ this.getVelocidade() +" em 5s";
		}

}
