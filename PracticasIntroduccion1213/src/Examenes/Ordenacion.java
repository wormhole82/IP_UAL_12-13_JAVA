package Examenes;

import java.util.Arrays;

public class Ordenacion {

	public static void main(String[] args) {

		long startTime,duration1,duration2;
		int[] v1 = null;
		int[] v2 = null;
		v1 = new int[100000];
		
		//inicializamos v1 con valores aleatorios [1,10]
		for (int i=0; i<v1.length; i++) 
			v1[i] = (int) (Math.random()*10+1);
		
		//inicializamos v2 como clon de v1
		
		v2 = v1.clone();
		
		//ordenamos v1 con nuestro método..medimos el tiempo
		
		startTime = System.nanoTime();
		ordenaArray(v1);
		duration1 = System.nanoTime() - startTime;
		
		//ordenamos v2 con el método sort() de Arrays...medimos el tiempo
		startTime = System.nanoTime();
		Arrays.sort(v2);
		duration2 = System.nanoTime() - startTime;
		
		System.out.println("El metodo de ordenacion " + (Arrays.equals(v1,v2)?"SI":"NO") + " funciona correctamente");
		System.out.println("Nuestro metodo ha tardado " + duration1 + " ns");
		System.out.println("El metodo de Arrays ha tardado " + duration2 + " ns");
	}

	public static void ordenaArray(int[] v) {
		int min = 0;
		int aux;
		for (int i = 0; i < v.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[min]) min = j;
			}
			if (i == min) continue;
			aux = v[i];
			v[i] = v[min];
			v[min] = aux;
		}
	}
}
