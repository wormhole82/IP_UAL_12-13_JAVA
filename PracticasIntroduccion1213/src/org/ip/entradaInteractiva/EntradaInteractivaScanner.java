package org.ip.entradaInteractiva;

import java.util.*;

public class EntradaInteractivaScanner {

	public static int leerEntero(String mensaje){
		System.out.print(mensaje);
		return new Scanner(System.in).nextInt();
	}
	public static double leerReal(String mensaje){
		System.out.print(mensaje);
		return new Scanner(System.in).nextDouble();
	}
	public static String leerCadena(String mensaje){
		System.out.print(mensaje);
		return new Scanner(System.in).nextLine();
	}
}
