package Examenes;
import org.ip.entradaInteractiva.*;

public class UsoCubo {
	
	public static void main(String[]args){
		int dimX=EntradaInteractivaScanner.leerEntero("Introduzca la dimension del eje X: ");
		int dimY=EntradaInteractivaScanner.leerEntero("Introduzca la dimension del eje Y: ");
		int dimZ=EntradaInteractivaScanner.leerEntero("Introduzca la dimension del eje Z: ");
		
		//CONSTRUCTOR PARA LOS CUBOS
		Cubo cub1=new Cubo(dimX, dimY, dimZ);
		Cubo cub2=new Cubo(dimX, dimY, dimZ);
		
		System.out.println("Cubo 1:\n"+ cub1);
		System.out.println("Cubo 2:\n"+ cub2);
		
		Cubo cub3 = cub1.sumar(cub2);
		System.out.println("LA SUMA DE LOS CUBOS 1 Y 2:\n" +cub3);
		
		//BUSCAR REPETICIONES DE UN NUMERO EN EL CUBO 3
		int valor = EntradaInteractivaScanner.leerEntero("Que numero quieres buscar? ");
		System.out.print("El valor "+valor+" se repite "+cub3.ocurrencias(valor));
		
		if(cub3.ocurrencias(valor)==1){
			System.out.println(" vez");
		}else
			System.out.println(" veces");
		
	}
}