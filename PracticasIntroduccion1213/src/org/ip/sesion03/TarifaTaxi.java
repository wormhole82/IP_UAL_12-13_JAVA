package org.ip.sesion03;

import org.ip.entradaInteractiva.*;

public class TarifaTaxi {

	public static void main(String[] args){
		
		// declaramos las variables
		int tiempoRecorrido, preciobase, tiempoMinimo, total;
		preciobase = 40;
		tiempoMinimo = 30;
				
		//Solicitamos tiempo de recorrido
		System.out.println("ÀTiempo de recorrido?");
		tiempoRecorrido = EntradaInteractiva.leerEntero();
		// ejecutamos las operaciones
		total = (tiempoRecorrido - tiempoMinimo) * 2 + preciobase;
				
		// ejecutamos las sentecinas y monstramos por pantalla el resultado
		if (tiempoRecorrido <= tiempoMinimo)
		System.out.println("El precio a pagar por el tiempo minimo de recorrido es: " + preciobase + " Û");
		else if (tiempoRecorrido > tiempoMinimo)
		System.out.println("El precio total del recorrido es " + total + " Û");
	}
}
