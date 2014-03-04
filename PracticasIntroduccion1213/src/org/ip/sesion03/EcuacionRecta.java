package org.ip.sesion03;

import org.ip.entradaInteractiva.*;

public class EcuacionRecta {

	public static void main(String[] args){

		//declaramos las variables
		int x1,x2,y1,y2;
		float a,b;
	
		//pedimos por pantalla el valor de los puntos
		System.out.println("Introduce el valor de x1:");
		x1=EntradaInteractiva.leerEntero();
		System.out.println("Introduce el valor de y1:");
		y1=EntradaInteractiva.leerEntero();
		System.out.println("Introduce el valor de x2:");
		x2=EntradaInteractiva.leerEntero();
		System.out.println("Introduce el valor de y2:");
		y2=EntradaInteractiva.leerEntero();
		
		//ejecutamos la expresion general de la ecuacion
		a=(y2-y1)/(x2-x1);
		b=((y1-x1)*(y2-y1))/(x2-x1);
		
		//mostramos el resultado por pantalla
		System.out.println("La ecuacion de la recta que pasa por los puntos \nP1=("+x1+","+y1+") y P2=("+x2+","+y2+") es y= "+a+"x + "+b);
	}
}