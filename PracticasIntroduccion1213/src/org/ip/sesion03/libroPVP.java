package org.ip.sesion03;
import org.ip.entradaInteractiva.*;

public class libroPVP {

	public static void main(String[] args) {
		
		// declaracion de variables
		int codigo;
		double pvp;
		String inicio,mensaje1,mensaje2,mensaje3,mensaje4,mensaje5,mensaje6;
		
		//inicializacion de las cadenas String
		inicio="El codigo ISBN cumple la condici—n:\n";
		mensaje1=inicio+" * empezar por 2 y acabar en 1 *";
		mensaje2=inicio+" * acabar en 1";
		mensaje3=" * no cumple la condici—n 1 y 2 *";
		mensaje4=" * cumple ser multiplo de 7 *";
		mensaje5=" * cumple ser un numero par *";
		mensaje6=" * y como el pvp del libro supera los 30 Û, tiene un descuento del 10% *";
		
		// Solicitamos el codigo ISBN por teclado
		System.out.println("Introduce el codigo ISBN del libro:");
		codigo = EntradaInteractiva.leerEntero();
		//ejecutamos las sentencias
		if ((codigo<1)||(codigo>10000)){
			System.out.println("El codigo ISBN no es valido");
		}else{
		// Transformamos un valor entero en un String
		String codigoString = Integer.toString(codigo);
		/* ejectumos las sentencias donde compararemos el primer valor con
		 * posicion 0 es decir, el primer valor para saber si el codigo empieza
		 * por 2 y mostramos el mensaje correspondiente a la operacion realizada*/
		if ((codigoString.charAt(0) == '2') && (codigo % 10 == 1)) {
			pvp = 25;
			System.out.println(mensaje1);
		} else if (codigo % 10 == 1) {
			pvp = 15;
			System.out.println(mensaje2);
		} else {
			pvp = 22;
			System.out.println(mensaje3);
			}
		/* ejecutamos las demas sentencias necesarias para el calculo del precio total
		y mostramos el mensaje correspondiente a la operacion realizada*/
		if (codigo % 7 == 0) {
			pvp = (pvp * 0.2 + pvp);
			System.out.println(mensaje4);
		} if (codigo % 2 == 0) {
			pvp = pvp + 13;
			System.out.println(mensaje5);
		} if (pvp > 30) {
			pvp = (pvp - (pvp * 0.1));
			System.out.println(mensaje6);
		}
		// mostrar por pantalla el resultado total
		System.out.println("El pvp del libro con codigo ISBN "+codigo+" es: " + pvp + " Û.");	
		}
	}
}