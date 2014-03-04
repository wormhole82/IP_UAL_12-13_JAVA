package org.ip.sesion05;
import org.ip.entradaInteractiva.*;

public class Mayor {

	public static void main(String[] args) {
		//declaramos las variables necesarias para la comparacion
		int n1, n2, n3;
		//solicitamos los datos por pantalla
		System.out.println("Introduce el primer numero");
		n1=EntradaInteractiva.leerEntero();
		System.out.println("Introduce el segundo numero");
		n2=EntradaInteractiva.leerEntero();
		System.out.println("Introduce el tercer numero");
		n3=EntradaInteractiva.leerEntero();
		//mostramos el resultado utilizando el metodo para calcular el mayor de 3 numeros
		System.out.print("El numero mayor de los tres numeros = "+calcularMayor(n1,n2,n3));
	}	
	//metodo para calcular el mayor de 3 numeros
	private static int calcularMayor(int num1, int num2, int num3){
		int mayor=0;
		if ((num1>=num2)&&(num1>=num3))
			mayor=num1;
		if ((num2>=num1)&&(num2>=num3))
				mayor=num2;
		if ((num3>=num1)&&(num3>=num2))
			mayor=num3;
		return mayor;	
		}
	}	