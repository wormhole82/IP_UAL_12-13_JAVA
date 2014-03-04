package org.ip.sesion08;

public class EjemploCadena2 {

	String cadena2;
	
	public EjemploCadena2(String cadena){
	this.cadena2=cadena;
	}
	public EjemploCadena2(EjemploCadena2 copia){
		this.cadena2=copia.cadena2;
	}
	public static String realizarConteo(String cadena2){
		int numLetras=0;
		int numEspacios=0;
		int numDigitos=0;
		char c;
	
		for(int i=0; i<cadena2.length();i++){
			c=cadena2.charAt(i);
			if(Character.isLetter(c)){
				numLetras++;
			}else if(Character.isDigit(c)){
				numDigitos++;
			}else if(Character.isWhitespace(c)){
				numEspacios++;
			}
		}
		return("\nNumero de Letras = "+numLetras+"\nNumero de Digitos = "+numDigitos+"\nNumero de Espacios = "+numEspacios);
	}
	public static String eliminarVocales(String cadena2){
		String aux=cadena2;
		aux=aux.replace('a','*');
		aux=aux.replace('e','*');
		aux=aux.replace('i','*');
		aux=aux.replace('o','*');
		aux=aux.replace('u','*');
		return aux;
	}
}