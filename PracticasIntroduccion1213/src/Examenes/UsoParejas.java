package Examenes;

public class UsoParejas {
	
	public static void main(String[] args) {

		Parejas pareja = new Parejas(3,3);

        	pareja.generaVocales();
        	System.out.println("Las vocales generadas son: \n" + pareja);
        	pareja.emparejaVocales();
        	System.out.println("Las parejas son: \n" + pareja);
        	System.out.println("Total parejas: " + pareja.getNumParejas());
 
//Ejercicio opcional

        	pareja.agruparVocalesEmparejadas();
        	System.out.println("Los grupos formados son: \n" + pareja);
        	System.out.println("Total grupos: " + pareja.getNumGrupos()); 
	}
}
//Ejemplo:
//
//	Las vocales generadas son:

//		Original
//			o 	u 	o 
//			a 	o 	a 
//			e 	a 	o 

//		Emparejados 
//			0 	0 	0 
//			0 	0 	0 
//			0 	0 	0 
//
//		Las parejas son: 
//		Original 
//			o 	u 	o 
//			a 	o 	a 
//			e 	a 	o 
//		Emparejados 
//			1 	0 	1 
//			2 	3 	2 
//			0 	0 	3 
//
//		Total parejas: 3
//		Los grupos formados son: 
//		Original 
//			o 	u 	o 
//			a 	o 	a 
//			e 	a 	o 
//		Emparejados 
//			4 	0 	4 
//			1 	4 	1 
//			0 	0 	4 
//		
//		Total grupos: 2