package com.stefanini.aprendendocomeclipse.aula7.entidade;

import com.stefanini.aprendendocomeclipse.aula7.Carro;

public class Ferrari extends Carro {
	public Ferrari(){
		this.setMarca("Ferrari");
	}
	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		//return super.acelerar();
		return "a Ferrari tem uma aceleração diferente";
	}

}
