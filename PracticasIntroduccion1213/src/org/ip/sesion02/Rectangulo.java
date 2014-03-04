package org.ip.sesion02;

public class Rectangulo {

	public static void main(String[] args) {
		
		//declaramos las variables
		float base,altura,area,perimetro,diagonal;
		
		//asignamos un valor a cada variable
		base=5.6f;
		altura=4.7f;
		
		//asignamos las operaciones que queremos realizar con las variables
		area=(base*altura);
		perimetro=2*(base+altura);
		diagonal=(float)Math.sqrt(Math.pow(base,2)+(Math.pow(altura,2)));
		
		//mostramos el restultado por pantalla
		System.out.println("El area de base "+base+" y altura "+altura+" es: "+area+" m*2.");
		System.out.println("El perimetro de base "+base+" y altura "+altura+" es: "+perimetro+" m.");
		System.out.println("La longitud de la diagonal de base "+base+" y altura "+altura+" es: "+diagonal+" m.");
	}
}