package org.ip.pruebasEnero;

public class UsoRobotSeguimiento {

	public static void main(String[] args) {
		RobotSeguimiento robot = new RobotSeguimiento(5,5);
		
		robot.generaObstaculos(); 
		System.out.println("Los obstaculos que el robot se va a encontrar son: \n" + robot);
		
		robot.generaRuta();
		System.out.println("La ruta a seguir es: \n" + robot);
		
		robot.recorreRuta();
		System.out.println("El camino recorrido es: \n" + robot);
		System.out.println("Se ha encontrado con " +  robot.getNumObstaculosE() + " obstaculos");
		
		//Ejercicio extra
		
		System.out.println("La distancia euclidea entre los puntos I y F es: " + robot.distanciaEuclidea());
	}

}

//Los obst�culos que el robot se va a encontrar son: 
//	0 	0 	0 	0 	0 
//	3 	3 	0 	0 	0 
//	0 	0 	0 	0 	0 
//	0 	0 	0 	3 	0 
//	3 	0 	0 	0 	0 
//
//La ruta a seguir es: 
//	0 	0 	0 	0 	0 
//	3 	3 	0 	0 	0 
//	1 	0 	0 	0 	0 
//	0 	0 	0 	3 	0 
//	3 	0 	0 	0 	2 
//
//El camino recorrido es: 
//	0 	0 	0 	0 	0 
//	3 	3 	0 	0 	0 
//	1 	0 	0 	0 	0 
//	4 	0 	0 	3 	0 
//	4 	4 	4 	4 	2 
//
//Se ha encontrado con 1 obstaculos