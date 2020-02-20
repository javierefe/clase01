package com.mitocode.ejercicio91.genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Programa {

	public static void main(String[] args) {
		
//		List lista = new ArrayList<>();
//		lista.add("Dany");
//	
//		System.out.println(lista.get(0));
//		
//		ClaseA<String> c1 = new ClaseA<String>("DANY");
//		c1.mostrarTipo();
//		
//		ClaseA<Integer> c2 = new ClaseA<Integer>(29);
//		c2.mostrarTipo();
		
		
		//operador diamante con varios esteoritipos
		ClaseB<String, Integer, String, Double> cb1 = new ClaseB<>("Dany", 29, "Cenas", 65.5);
		cb1.mostrarTipo();
	}

}
