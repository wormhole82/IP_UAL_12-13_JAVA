package org.ip.sesion08;
import org.ip.entradaInteractiva.*;

public class UsoPalindromo {

	public static void main(String[] args) {
		
		String entrada;
		
		do{
			System.out.println("Escribe un palindromo...intro para salir:");
			entrada=EntradaInteractiva.leerString();
			
			if(!entrada.isEmpty()){
				if(Palindromo.esPalindromo(entrada)){
					System.out.println("....que si\n");
				}else{
					System.out.println("....que no\n");
				}
			}
		}while(!entrada.isEmpty());
	}
}