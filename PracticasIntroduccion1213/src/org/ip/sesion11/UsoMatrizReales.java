package org.ip.sesion11;

import org.ip.entradaInteractiva.EntradaInteractivaScanner;

public class UsoMatrizReales {

	public static void main(String[] args) {
		
		int dim1=EntradaInteractivaScanner.leerEntero("Introduzca el valor de la 1 Dimension: ");
		int dim2=EntradaInteractivaScanner.leerEntero("Introduzca el valor de la 2 Dimension: ");
		long tI, tF;
		
		MatrizReales m1 = new MatrizReales(dim1,dim2);
		MatrizReales m2 = new MatrizReales(dim1,dim2);
		MatrizReales mR = null;
		
		System.out.println("m1: \n"+m1);
		System.out.println("m2: \n"+m2);
		
		tI=System.nanoTime();
		mR=m1.sumar(m2);
		tF=System.nanoTime();
		
		System.out.println("m1+m2= \n"+mR);
		System.out.println("\n\t Operacion suma realizada en "+(tF-tI)+" ns\n");
		
		tI=System.nanoTime();
		mR=m1.restar(m2);
		tF=System.nanoTime();
		
		System.out.println("m1-m2= \n"+mR);
		System.out.println("\n\t Operacion resta realizada en "+(tF-tI)+" ns\n");

		System.out.println("\nEl metodo clone() "+(m1.equals(m1.clone())?"SI":"NO")+" funciona correctamente");
		
		
	}

}
