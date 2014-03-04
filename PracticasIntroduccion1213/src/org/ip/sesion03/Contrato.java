package org.ip.sesion03;

import org.ip.entradaInteractiva.*;

public class Contrato {

	public static void main(String[] args) {
		
		//declaramos las variables que vamos a utilizar
		int edad, prueba1, prueba2, pruebaTotal;
		String contratado, noContratado;
		
		//introduciomos los Strings que vamos a utilizar para el mensaje de respuesta
		contratado ="Has pasado todas las pruebas, eres apto para contratarte.";
		noContratado="No has pasado todas las pruebas, no eres apto para contratarte.";
		
		//solicitamos los datos por teclado
		System.out.println("ÀQue edad tienes?");
		edad=EntradaInteractiva.leerEntero();
		System.out.println("ÀCual es tu puntuacion en la prueba 1?");
		prueba1=EntradaInteractiva.leerEntero();
		System.out.println("ÀCual es tu puntuacion en la prueba 2?");
		prueba2=EntradaInteractiva.leerEntero();
		
		//ejecutamos la sentencia de las 2 pruebas
		pruebaTotal=prueba1+prueba2;
		
		//ejecutamos las condiciones que decidiran si es apto o no y mostramos el resultado por pantalla
		if (edad>=18 && pruebaTotal>85){
			System.out.println(contratado);
			}else System.out.println(noContratado);
		}
	}