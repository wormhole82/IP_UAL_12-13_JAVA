package org.ip.sesion08;

public class Palindromo {
	
	//METODO PARA VERIFICAR LA CADENA
	public static boolean esPalindromo(String cadena){
		String cadenaProcesada=procesarCadena(cadena);
		String cadenaInvertida=invertirCadena(cadenaProcesada);
		return cadenaInvertida.equals(cadenaProcesada);
		}
	//METODO PARA PROCESAR CADENA
	private static String procesarCadena(String cadena){
		String auxiliar=cadena.toLowerCase();
		auxiliar=auxiliar.replaceAll(" ","");
		auxiliar=auxiliar.replaceAll("á","a");
		auxiliar=auxiliar.replaceAll("é","e");
		auxiliar=auxiliar.replaceAll("í","i");
		auxiliar=auxiliar.replaceAll("ó","o");
		auxiliar=auxiliar.replaceAll("ú","u");
		return auxiliar;
	}
	//METODO PARA INVERTIR CADENA
	private static String invertirCadena(String cadena){
		String auxiliar="";
		for(int i=cadena.length()-1;i>=0;i--){
			auxiliar+=cadena.charAt(i);
		}
		return auxiliar;
	}	
}