package org.ip.sesion06;

public class UsoAparatoElectrico {

	public static void main(String[] args) {
		
		//Creacion de objetos definidos
		AparatoElectrico bombilla = new AparatoElectrico (100);
		AparatoElectrico radiador = new AparatoElectrico (2000);
		AparatoElectrico plancha = new AparatoElectrico (1200);
		
		//Mostramos por pantalla el consumo inicial
		System.out.println("Potencia incial con todos los aparatos apagados: "+AparatoElectrico.consumo()+" watios.");
		
		//Utilizamos el metodo para encender la bombilla y la plancha
		bombilla.encender();
		plancha.encender();
		System.out.println("\nEncendemos la bombilla y la plancha.");
		
		//Mostramos el consumo total
		System.out.println("Potencia total: "+(int)AparatoElectrico.consumo()+" watios.");
		
		//Utilizamos el metodo para apagar la plancha y el radiador
		plancha.apagar();
		radiador.encender();
		System.out.println("\nApagamos la plancha y encendemos el radiador.");
		//Mostramos el consumo total
		System.out.println("Potencia total: "+(int)AparatoElectrico.consumo()+" watios.");	
	}
}