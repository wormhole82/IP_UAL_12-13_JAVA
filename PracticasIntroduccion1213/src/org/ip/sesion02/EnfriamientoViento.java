package org.ip.sesion02;

public class EnfriamientoViento {

	public static void main(String[] args) {
		
		//declaramos las variables
		int temperatura,velocidadViento;
		double enfriamientoViento;
		
		//damos valores a las variables
		temperatura=200;
		velocidadViento=500;
		
		
		//ejecutamos la formula del enfriamiento del viento
		enfriamientoViento=35.74+0.6215*temperatura+(0.4275*temperatura-35.75)*Math.pow(velocidadViento,0.16);
		
		//mostramos los resultados
		System.out.print("El enfriamiento del viento segun la formula del National Weather " +
				"Service\npara una temperatura t="+temperatura+" y una velocidad del viento v="
				+velocidadViento+" es w="+enfriamientoViento);	
	}
}