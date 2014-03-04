package Examenes;
import org.ip.entradaInteractiva.*;

public class UsoMatrizReales {
	public static void main(String[] args) {
		//INTRODUCIMOS DIMENSIONES POR TECLADO
		
		int dim1 = EntradaInteractivaScanner.leerEntero("Introduzca el valor de la 1» Dimensi—n: ");
		int dim2 = EntradaInteractivaScanner.leerEntero("Introduzca el valor de la 2» Dimensi—n: ");

		long tI, tF;
		
		//CREAMOS OBJETOS
		MatrizReales m1 = new MatrizReales(dim1, dim2);
		MatrizReales m2 = new MatrizReales(dim1, dim2);
		
		MatrizReales mR = null;
		
		System.out.println("m1: \n" + m1);
		System.out.println("m2: \n" + m2);
		
		//SUMAMOS Y RESTAMOS 2 MATRICES Y COMPROBAMOS EL TIEMPO 
		tI = System.nanoTime();
		mR = m1.sumar(m2);
		tF = System.nanoTime();
		System.out.println("m1+m2 = \n" + mR);
		System.out.println("\n\t Operación suma realizada en " + (tF - tI)+ " ns\n");
		tI = System.nanoTime();
		mR = m1.restar(m2);
		tF = System.nanoTime();
		
		System.out.println("m1-m2 = \n" + mR);
		System.out.println("\n\t Operación resta realizada en " + (tF - tI)+ " ns\n");
		
		//COMPROBAMOS METODO CLONE
		System.out.println("\nEl método clone() "+ (m1.equals(m1.clone()) ? "SI" : "NO")+ " funciona correctamente");
		
		//COMPROBAMOS METODOS REDIMENSIONAR.TRANSPUESTA Y REDIMENSIONAR CLONE
		MatrizReales m3 = new MatrizReales(dim1, dim2);
		System.out.println("m3: \n" + m3);
		m3.redimensionar(5,7);
		System.out.println("\nRedimensionamos m3 a 5,7 ");
		System.out.println("m3: \n" + m3);
		
		System.out.println("\nm4 es la transpuesta de m1 ");
		MatrizReales m4=m1.transpuesta();
		System.out.println("m4: \n" + m4);
		
		System.out.println("\nm5 es m3 clonada y redimensionada a 5,6 ");
		MatrizReales m5=m3.redimensionarClone(5,6);
		System.out.println("m5: \n" + m5);
	}
}
