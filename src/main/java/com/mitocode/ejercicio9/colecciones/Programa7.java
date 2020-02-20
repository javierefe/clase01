package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programa7 {

	public static void main(String[] args) {
		
		Character[] letras = {'P','C','M'};
		List<Character> lista = Arrays.asList(letras);
		System.out.println("Lista: ");
		imprimir(lista);
		
		//invertir ista
		Collections.reverse(lista);
		System.out.println("Lista invertida");
		imprimir(lista);
		
		//copiar lista
		Character[] listaCopia = new Character[lista.size()];
		List<Character> copiaLista = Arrays.asList(listaCopia);
		
		Collections.copy(copiaLista, lista);
		System.out.println("lista copiada: ");
		imprimir(copiaLista);
		
		
		//Fill
		
		Collections.fill(lista,'R');
		System.out.println("lista llenada de R: ");
		imprimir(lista);
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(1000);
		numeros.add(-40);
		numeros.add(30);
		
		System.out.println("Valor maximo y minimo");
		System.out.println("Max: " + Collections.max(numeros));
		System.out.println("Min: " + Collections.min(numeros));
		
		
		//unir lista
		
		List<Character> listaExtend = new ArrayList<>();
		listaExtend.add('A');
		listaExtend.add('B');
		listaExtend.add('C');
		Collections.addAll(listaExtend, letras);
		System.out.println("lista extend: ");
		imprimir(listaExtend);
		
		
		
	}
	public static void imprimir(List<Character> lista) {
		for (Character character : lista) {
			System.out.print(character + " ");
		}
		System.out.println("");
	}	
	
}
