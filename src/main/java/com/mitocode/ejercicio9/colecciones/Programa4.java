package com.mitocode.ejercicio9.colecciones;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colores = {"negro","azul", "amarillo"};
		
		LinkedList<String> lista = new LinkedList<String>(Arrays.asList(colores));
		
		lista.add("negro");
		lista.add("azul");
		lista.add("amarillo");
		
		///añadir en posicion
		lista.add(2,"verde");
		System.out.println("Se añadio en la posicion 2");
		for (String color : lista) {
			System.out.println(color);
		}
		
		//añadir al inicio
		lista.addFirst("rosa");
		System.out.println("Se añadio al inicio");
		
		for (String color: lista) {
			System.out.println(color);
		}
		// añadir al ultimo
		lista.addLast("cyan");
		System.out.println("Se añadio al final");
		for (String color: lista) {
			System.out.println(color);
		}
	}

}
