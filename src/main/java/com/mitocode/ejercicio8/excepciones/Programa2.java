package com.mitocode.ejercicio8.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) throws Exception, FileNotFoundException {
		FileInputStream fis = new FileInputStream("src/main/resources/archivo.txt");
		int k;
		while((k=fis.read())!=-1) {
			System.out.println((char)k);
		}
	}

}
