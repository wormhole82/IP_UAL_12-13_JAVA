package org.ip.sesion02;

public class AleatorioEntero {

	public static void main(String[] args) {
		
		//declaramos las variables
		int N,M,aleatorio;
		
		//asignamos el valor dado
		N=10;
		
		//buscamos un valor aleatorio entre 0 y N
		M=(int) (Math.random()*N-1);
		
		//buscamos un valor aleatorio entre N y M
		aleatorio=(int) (Math.random()*(M-N)+N);
		
		//mostramos los resultados
		System.out.println("El valor aleatorio entre 0 y N, donde N= "+N+", M= "+M+".\n");
		System.out.println("El valor aleatorio entre N y M, donde N= "+N+" y M= "+M+" , es "+aleatorio+".");
	}
}