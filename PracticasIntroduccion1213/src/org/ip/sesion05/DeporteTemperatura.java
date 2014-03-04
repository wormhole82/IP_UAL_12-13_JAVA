package org.ip.sesion05;
import org.ip.entradaInteractiva.*;

public class DeporteTemperatura {

	public static void main(String[] args) {
		
		//Declaramos las variables
		double temperatura; 
		float fahren;
		
		//solicitamos por pantalla la temperatura
		System.out.print("ÀQue temperatura hace en ¼C? ");
		temperatura=EntradaInteractiva.leerDouble();
		
		//ejectumos el metodo para convertir la temperatura a ¼F
		fahren=conversion(temperatura);
		
		//mostramos los resultados
		System.out.println("La temperatura en »F es = " +fahren+"¼F");	
		System.out.print("El mejor deporte a realizar es = "+deporte(fahren));	
	}
	
	//Metodo para convertir una temperatura en »C a ¼F
	private static float conversion(double temperatura) {
		float fahren;
		fahren = (float) (temperatura * 9 / 5 + 32);
		return fahren;
	}
	
	//Metodo para elegir un deporte seguna la temperatura en »F
	private static String deporte(float grados){
	String actividad=null;
	float tempFahren;
	tempFahren = grados;
	
	if (tempFahren > 85)
		actividad = "Nataci—n";
	else if (tempFahren >= 70)
		actividad = "Tenis";
	else if (tempFahren >= 32)
		actividad = "Golf";
	else if (tempFahren >= 10)
		actividad= "Esqu’";
	else if (tempFahren < 10)
		actividad = "Ajedrez";
	return actividad;
	}
}