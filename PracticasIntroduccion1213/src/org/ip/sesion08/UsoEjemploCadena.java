package org.ip.sesion08;

import org.ip.entradaInteractiva.EntradaInteractiva;

public class UsoEjemploCadena {

	public static void main(String[] args) {
		
		EjemploCadena cadena = new EjemploCadena("Hola, vivo en la Marquina, 123, 5-7");
		String comando;
		
		do{
			System.out.println("Introduzca una cadena de caracteres");
			System.out.println("...teclee \"Quiero salir de aqui\" para ternimar:");
			
			comando=EntradaInteractiva.leerString();
			if(comando.toLowerCase().equals("quiero salir de aqui"))break;
			
			System.out.println(cadena.realizarConteo());
			System.out.println(cadena.eliminarVocales());	
		
		}while(true);
		System.out.println("FIN DEL PROGRAMA");
	}
}