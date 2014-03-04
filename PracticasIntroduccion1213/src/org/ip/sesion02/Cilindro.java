package org.ip.sesion02;

public class Cilindro {

	public static void main(String[] args) {
		
		//declaramos las variables
		float radio, altura, area, volumen;
		
		//asignamos un valor a cada variable
		radio=5.6f;
		altura=10.9f;
		
		//resolvemos las operaciones a calcular
		area=(float) Math.PI*2*radio*(radio+altura);
		volumen=(float)Math.PI*(float)Math.pow(radio, 2)*altura;
		
		//mostramos los resultados
		System.out.println("El area de un cilindro con radio "+radio+" m y altura "+altura+" m es "+area+" m*2");
		System.out.println("El volumen de un cilindro con radio "+radio+" m y altura "+altura+" m es "+volumen+" m*3");
	}
}