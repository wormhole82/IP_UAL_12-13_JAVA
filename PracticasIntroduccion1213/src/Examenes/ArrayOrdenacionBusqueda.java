package Examenes;

import org.ip.entradaInteractiva.*;

public class ArrayOrdenacionBusqueda {

	// Metodos
	public static void inicializar(int[] v) {

		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 1000);
		}
	}

	public static void mostrar(int[] v) {

		System.out.print("{");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i < v.length - 1)
				System.out.print(", ");
		}
		System.out.println("}");
	}
	// metodo de ordenacion por seleccion
	public static void ordenar(int[] v) { 

		int posicion, temp;

		for (int i = 0; i < v.length - 1; i++) {
			posicion = i;
			for (int j = i + 1; j < v.length; j++) {
				
				if (v[j] < v[posicion]) {
					posicion = j;
				}
			}
			if (i != posicion) {
				temp = v[i];
				v[i] = v[posicion];
				v[posicion] = temp;
			}
		}
	}
	
	// metodo de busqueda secuencial
	public static int buscar(int numABuscar, int[] v) { 
		int posicion = -1;

		for (int i = 0; i < v.length; i++) {
			if (v[i] == numABuscar) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	// metodo de busqueda secuencial mejorado.BREAK;
	public static int buscarMejorado(int numABuscar, int[] v) { 
		int posicion = -1;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == numABuscar) {
				posicion = i;
				break;
			}
		}
		return posicion;

	}

	public static void main(String[] args) {
		final int MAX = 5;
		//Scanner teclado = new Scanner(System.in);
		int[] v = new int[MAX];
		int posicion;
		int valor;

		inicializar(v);
		mostrar(v);
		ordenar(v); // ordenamos la estructura
		System.out.print("Una vez ordenado el algoritmo es ");
		mostrar(v);

		// Procedemos a buscar un elemento especificado por el usuario
		System.out.print("Valor que desea buscar:");
		valor = EntradaInteractiva.leerEntero();//teclado.nextInt();

		System.out.println("***METODO SECUENCIAL***");
		posicion = buscar(valor, v);

		if (posicion != -1)
			System.out.println("Elemento encontrado en la posicion: "+ posicion);
		else
			System.out.println("Elemento NO encontrado.");

		long tIni, tFin;

		tIni = System.nanoTime();
		buscar(valor, v);
		tFin = System.nanoTime();

		System.out.println("El tiempo invertido ha sido de " + (tFin - tIni)+ " ns");
		System.out.println("**METODO SECUENCIAL MEJORADO**");
		posicion = buscarMejorado(valor, v);

		if (posicion != -1)
			System.out.println("Elemento encontrado en la posicion: "+ posicion);
		else
			System.out.println("Elemento NO encontrado.");

		tIni = System.nanoTime();
		buscarMejorado(valor, v);
		tFin = System.nanoTime();

		System.out.println("El tiempo invertido ha sido de " + (tFin - tIni)+ " ns");
	}
}