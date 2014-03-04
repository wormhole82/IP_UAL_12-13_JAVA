package org.ip.sesion07;

import org.ip.entradaInteractiva.EntradaInteractiva;

public class UsoSerieEnteros2 {

	public static void main(String[] args) {
		
		// DECLARACION DE VARIABLES
		int n = 0;
		SerieEnteros serie = null;
		
		// INICIAMOS EL TRY/CATCH PARA CAPTURAR EXCEPCIONES
		try {
			// INICIAMOS EL DO/WHILE PARA HACER UN BUCLE INFINITO HASTA QUE N<0
			do {
				// SOLICITAMOS EL VALOR DE LA SERIE
				System.out.println("Introduzca el valor maximo de la serie:\nPara salir introduce un numero negativo:");
				n = EntradaInteractiva.leerEntero();
				// CREAMOS EL OBJETO
				serie = new SerieEnteros(n);

				if (n > 0) {
					// MOSTRAMOS POR PANTALLA LOS RESULTADOS DE LOS METODOS DECLARADOS EN LA CLASE SerieEnteros
					System.out.println("La serie estudiada es: "+ serie.toString());
					System.out.println("Sumatoria = " + serie.calcularSum());
					System.out.println("Productorio = " + serie.calcularProd());
					System.out.println("Sum. Pares = "+ serie.calcularSumPares());
					System.out.println("Sum. Impares = "+ serie.calcularSumImpares());
					System.out.println("Media Aritmetica = "+serie.mediaArit());
					System.out.println("********************************************");
				} else
					System.out.println("Has introducido un numero negativo.");

			// FIN DEL DO/WHILE
			} while (n > 0);
			System.out.println("***FIN DEL PROGRAMA***");

		// FIN DEL TRY/CATCH
		} catch (Exception e) {
			System.out.println("No es un numero entero");
		}
	}
}