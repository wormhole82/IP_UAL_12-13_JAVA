package org.ip.sesion10;
import org.ip.entradaInteractiva.*;

public class UsoVectorReales {

	public static void main(String[] args) {
		//Declaración de variables
		VectorReales v1 = null; //vector v1
		VectorReales v2 = null; //vector v2
		VectorReales vRes = null; //vector para almacenar resultados int dim; //dimensión de los vectores
		int dim;
		
		dim = EntradaInteractivaScanner.leerEntero("Introduzca el valor de la dimensión: ");
		v1 = new VectorReales(dim); 
		v2 = new VectorReales(dim);
		System.out.println("Vamos a realizar operaciones con " + VectorReales.getNumVectores() + " vectores");
		
		//operación sumar
		vRes = v1.sumar(v2);
		System.out.println("v1+v2 = " + vRes.toString());
		
		//operación restar
		vRes = v1.restar(v2);
		System.out.println("v1-v2 = " + vRes.toString());
		vRes = v2.restar(v1);
		System.out.println("v2-v1 = " + vRes.toString());
		
		//módulo de v1
		System.out.println("|v1| = " + v1.norma()); //producto de un vector por un escalar
		System.out.println("10v1 = " + v1.productoEscalar(10));
		
		//producto escalar de dos vectores v1v2
		System.out.println("v1v2 = " + v1.productoEscalar(v2));
		
		//distancia entre 2 vectores
		System.out.println("dist(v1,v2) = " + v1.distancia(v2)); System.out.println("dist(v2,v1) = " + v2.distancia(v1));
		
		//ángulo entre 2 vectores
		System.out.println("angulo(v1,v2) = " + v1.angulo(v2));
		System.out.println("angulo(v2,v1) = " + v2.angulo(v1)); 
		
		//clonamos v1 y comprobamos que ha sido correcta la operacion
		vRes=v1.clone();
		System.out.println("Los vectores "+(vRes.equals(v1)?"SI":"NO")+" son iguales");
		
	}
}