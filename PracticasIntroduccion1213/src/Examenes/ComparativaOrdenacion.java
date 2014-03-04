package Examenes;

import java.util.Arrays;

public class ComparativaOrdenacion {
	
	// inicializamos los dos arrays con valores aleatorios entre [0,1000)
	// las dos estructuras deberán ser idénticas
	
	public static void inicializar(int[] v, int[] w) {
		for (int i = 0; i < v.length; i++) {
			v[i] = w[i] = (int) (Math.random() * 1000);
		}
	}

	public static void ordenar(int[] v) {
		// método de ordenación por selección visto en clase
		int posicion, temp;
		
		for (int i = 0; i < v.length - 1; i++){
			posicion = i;
			for (int j = i + 1; j < v.length; j++){
                 if (v[j] < v[posicion])
                 {
                  posicion = j;
                        }
                }
                if (i != posicion) 
                {
                        temp= v[i];
                        v[i] = v[posicion];
                        v[posicion] = temp;
                }
        }
	}
	
	public static void mostrar(int[] v){
		
		System.out.print("{");
		for (int i=0; i<v.length; i++){
			System.out.print(v[i]);
			if (i<v.length-1) 
				System.out.print(", ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		final int MAX = 7;
	
		int[] v = new int[MAX];
		int[] w = new int[MAX];
		
		long tIni, tFin;
		
		inicializar(v, w); // inicializamos las estructuras
		
		System.out.print("***ANTES*** \nv = w = "); mostrar(v);
		
		System.out.println("\n***DESPUES***");
		
		
		tIni = System.nanoTime();
		ordenar(v);// ordenamos el array v con nuestro método
		tFin = System.nanoTime();
		
		System.out.print("v= "); mostrar(v);
		
		System.out.println("El tiempo invertido en ordenarlo por el metodo por seleccion ha sido de "+ (tFin - tIni) + " ns");
		
		tIni = System.nanoTime();
		Arrays.sort(w);// ordenamos el array w con el método sort()
		tFin = System.nanoTime();

		System.out.print("\nw= "); mostrar(w);
		
		System.out.println("El tiempo invertido en ordenarlo por el metodo Sort() ha sido de "+ (tFin - tIni) + " ns");
		
		
		// comprobamos que ambos arrays "ya ordenados" son iguales.
		if (Arrays.equals(v, w))
			System.out.println("\nNuestro metodo de ordenacion es correcto");
		else
			System.out.println("\nNuestro metodo de ordenacion NO es correcto");
	}
}
