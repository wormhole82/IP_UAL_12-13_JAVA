package org.ip.sesion07;
import org.ip.entradaInteractiva.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int numero, aleatorio,rango,intentos;
		intentos=0;
		
		System.out.println("Introduce el numero maximo para adivinarlo");
		rango=EntradaInteractiva.leerEntero();
		aleatorio=(int) (Math.random()*rango);
		
		do{
			System.out.println("Introduce un numero:");
			numero=EntradaInteractiva.leerEntero();
			
			if(numero>rango){
				System.out.println("Te has pasado del rango maximo");
			}else if (numero<aleatorio){
				intentos++;
				System.out.println("El numero es mayor");
			}else if (numero>aleatorio){
				intentos++;
				System.out.println("El numero es menor");
			}else{
				System.out.println("¡HAS ACERTADO!");
				intentos++;
			}
		}while(numero!=aleatorio);
		System.out.println("Has hecho "+intentos+" intentos");

	}

}
