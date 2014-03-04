package org.ip.sesion02;

public class OperadorUnario {

	public static void main(String[] args) {
		
		int i,a,b,c;
		
		// mostrar por pantalla la cabecera
		System.out.println("\t\t\tAntes\t\tDurante\t\tDespués");
		//iniciamos la variable i con un valor
		i = 8;
		a = i;
		//operacion a realizar
		b = i++;
		c = i;
		// mostrar por pantalla el resultado de las operaciones
		System.out.println("Operador i++\t\t" + a + "\t\t" + b + "\t\t" + c);
		//iniciamos la variable i con un valor
		i = 8;
		a = i;
		//operacion a realizar
		b = i--;
		c = i;
		// mostrar por pantalla el resultado de las operaciones
		System.out.println("Operador i--\t\t" + a + "\t\t" + b + "\t\t" + c);
		//iniciamos la variable i con un valor
		i = 8;
		a = i;
		//operacion a realizar
		b = ++i;
		c = i;
		// mostrar por pantalla el resultado de las operaciones
		System.out.println("Operador ++i\t\t" + a + "\t\t" + b + "\t\t" + c);
		//iniciamos la variable i con un valor
		i = 8;
		a = i;
		//operacion a realizar
		b = --i;
		c = i;
		// mostrar por pantalla el resultado de las operaciones
		System.out.println("Operador --i\t\t" + a + "\t\t" + b + "\t\t" + c);
	}	
}