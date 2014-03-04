package org.ip.sesion07;

import org.ip.entradaInteractiva.EntradaInteractiva;

public class UsoSerieEnteros {
	
	public static void main(String[] args) {
		
		int n=0;
		SerieEnteros serie=null;
		
		System.out.println("Introduzca el valor maximo de la serie");
		n= EntradaInteractiva.leerEntero();
		
		serie = new SerieEnteros(n);
		
		System.out.println("La serie estudiada es: "+serie.toString());
		System.out.println("Sumatoria = "+serie.calcularSum());
		System.out.println("Productorio = "+serie.calcularProd());
		System.out.println("Sum. Pares = "+serie.calcularSumPares());
		System.out.println("Sum. Impares = "+serie.calcularSumImpares());	
	}
}