package org.ip.sesion03;

import org.ip.entradaInteractiva.*;

public class Ecuacion2Grado {
	
	public static void main(String[] args){
		
		//declaracion de variables
		int a,b,c,d,x,x1,x2;
	
		//mostramos por pantalla la forma de la ecuacion tipica de 2¼ grado
		System.out.println("Segun una ecuacion de 2¼ grado de forma ax^2+bx+c=0");
		
		//solicitamos los valores de la ecuacion por teclado
		System.out.print("Introduce el valor de a= ");
		a=EntradaInteractiva.leerEntero();
		System.out.print("Introduce el valor de b= ");
		b=EntradaInteractiva.leerEntero();
		System.out.print("Introduce el valor de c= ");
		c=EntradaInteractiva.leerEntero();

		//ejecutamos las operaciones
		d=(b*b)-(4*a*c);
		x=-b/(2*a);
		x1=(-b+(int)Math.sqrt(d))/(2*a);
		x2=(-b-(int)Math.sqrt(d))/(2*a);
		
		//mostramos mensaje de la ecucion con los valores introducidos
		System.out.print("La ecuacion "+a+"x^2+"+b+"x+"+c);
		
		//ejecutamos las sentecias segun el resultado de las operaciones y mostramos por pantalla el resultado
		if (d<0){
			System.out.print(" no tiene solucion real.");
		}else if (d==0){
			System.out.print(" tiene una unica solucion real x="+x+".");
		}else{
		System.out.print(" tiene como soluciones reales x1= "+x1+" y x2= "+x2+".");
		}
	}
}