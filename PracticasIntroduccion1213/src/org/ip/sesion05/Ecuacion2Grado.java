package org.ip.sesion05;
import org.ip.entradaInteractiva.EntradaInteractiva;

public class Ecuacion2Grado {

public static void main(String[] args) {
		//declaracion de variables
		double a, b, c;
		
		//peticion de los datos para calcular la ecuacion
		System.out.println("Segun una ecuacion de 2¼ grado de forma ax^2+bx+c=0");
		System.out.print("Introduce el valor de a= ");
		a=EntradaInteractiva.leerEntero();
		System.out.print("Introduce el valor de b= ");
		b=EntradaInteractiva.leerEntero();
		System.out.print("Introduce el valor de c= ");
		c=EntradaInteractiva.leerEntero();
		
		//metodo para mostrar las posibles soluciones
		verResultado(solucion(a,b,c));
	}
	
//metodo para calcular el discrimante
	private static double discriminante(double a, double b, double c){
		return (b*b-4*a*c)/(2*a);
	}
	
	//metodo String para mostrar mensajes
	private static void verResultado(String mensaje) {
			System.out.println(mensaje);
	}
	
	//metodo para mostrar el resultado de la ecuacion
	private static String solucion(double a, double b, double c){
		double x,x1,x2,d;
		//metodo para calcular discrimente
		d=discriminante(a,b,c);
		//sentencias para el resultado total dependiendo de la soluciones
		if (d<0){
			 return "La ecuaci—n "+a+"x^2+"+b+"x+"+c+" no tiene soluci—n real.";
		}else if(d==0){
			x=-b/(2*a);
			return "El resultado de la ecuaci—n "+a+"x^2+"+b+"x+"+c+" es: "+x;
		}else{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			return "Los resultados de la ecuaci—n "+a+"x^2+"+b+"x+"+c+" son :\nx1= "+x1+"\nx2= "+x2;
		}
	}
}