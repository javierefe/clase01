package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mitocode.ejercicio6.enums.avanzados.CuentaAhorros;

public class Programa2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		System.out.println("Estructura oreach");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorros> listaCuentas = new ArrayList<>();
		
		CuentaAhorros c1 = new CuentaAhorros();
		c1.setNumeroCuenta("10");
		c1.setTitular("dany");
		c1.setSaldo(1000);
		
		CuentaAhorros c2 = new CuentaAhorros();
		c1.setNumeroCuenta("11");
		c1.setTitular("jose");
		c1.setSaldo(1000);
		
		CuentaAhorros c3 = new CuentaAhorros();
		c1.setNumeroCuenta("12");
		c1.setTitular("Pedro");
		c1.setSaldo(1000);
		
		listaCuentas.add(c1);
		listaCuentas.add(c2);
		listaCuentas.add(c3);
		
		for (CuentaAhorros cuentaAhorros : listaCuentas) {
			System.out.println(cuentaAhorros);
		}
	}

}
