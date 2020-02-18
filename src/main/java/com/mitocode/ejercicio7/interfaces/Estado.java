package com.mitocode.ejercicio7.interfaces;

public enum Estado {

	ACTIVA(1), BLOQUEADA(2), PENDIENTE(3);
	
	private int codigo;

	private Estado(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
