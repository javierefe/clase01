package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> lista = new LinkedList<>();
		lista.add("MAGENTA");
		lista.add("ROJO");
		lista.add("BLANCO");
		lista.add("AZUL");
		lista.add("CYAN");
		
		System.out.print("Colores");
		for (String color : lista) {
			System.out.println(color + " ");
		}
		
		LinkedList<String> listaEliminar = new LinkedList<>();
		listaEliminar.add("ROJO");
		listaEliminar.add("BLANCO");
		listaEliminar.add("AZUL");
		
		System.out.println("Elementos a eliminar");
		for (String color : listaEliminar) {
			System.out.println(color+ " ");
		}
		
		
		Iterator<String> itetaror = lista.iterator();
		while (itetaror.hasNext()) {
			if (lista.contains(itetaror.next())) {
				itetaror.remove();
			}
		}
		System.out.println(lista.size());
		System.out.println(listaEliminar.size());
		
		for (String color : lista) {
			System.out.println(color);
		}
		
//		eliminar(lista, listaEliminar);
//		for (String color : lista) {
//			System.out.println(color);
//		}
		
	}
	
	
	public static void eliminar(LinkedList<String> lista1, LinkedList<String> lista2) {
		Iterator<String> iterator = lista1.iterator();
		while (iterator.hasNext()) {
			if (lista2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
