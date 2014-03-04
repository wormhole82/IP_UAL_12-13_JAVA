package org.ip.sesion03;

import org.ip.entradaInteractiva.*;

public class CodigoDefectuoso {

	public static void main(String[] args){
		
		//declaracion de la variable
		int codigo;
		
		//solicitamos el codifo del articulo por teclado
		System.out.println("Introduce el codigo del producto:");
		codigo=EntradaInteractiva.leerEntero();
		
		//condiciones para saber si es defectuoso o no, y mostramos por pantalla el resultado por pantalla
		if (((codigo>=14500)&&(codigo<=15500))||((codigo>=33000)&&(codigo<=45300))){
		System.out.println("Codigo defectuoso.");
		}else{
	    System.out.println("Codigo correcto.");
		}
	}
}