package org.ip.sesion05;
import org.ip.entradaInteractiva.*;

public class CalculoIntereses {

	public static void main(String[] args) {
		
		//declaracion de variables
		double capital, intereses, meses,retencion,ganancia,reten,total;
		
		//inilializacion de la varible de valor fijo
		retencion=18;
		
		//solicitamos al usuario los datos para hacer los calculos
		System.out.print("ÀCual es la cantidad a invertir? ");
		capital=EntradaInteractiva.leerDouble();
		System.out.print("ÀQue intereses te ofece el UALb? ");
		intereses=EntradaInteractiva.leerDouble();
		System.out.print("ÀCuantos meses a plazo fijo quieres mantener tu inversion de "+capital+" Û? ");
		meses=EntradaInteractiva.leerDouble();
		
		//ejecutamos los metodos para calcular los datos necesarios
		ganancia=cantidadGenerada(capital,intereses,meses);
		reten=retencionCapital(ganancia,retencion);
		total=totalCobrar(ganancia,reten);
		
		//mostramos por pantalla los resultados
		System.out.println("\nDinero a invertir: "+capital+" Û");
		System.out.println("El interes anual es del "+intereses+"%");
		System.out.println("La cantidad de intereses generados a los "+meses+" meses de inversion ha sido de "+ganancia+" Û");
		System.out.println("La retencion aplicada por Hacienda es del "+retencion+"% y se retendr‡ "+reten+" Û");
		System.out.println("Total a cobrar: "+total+" Û");	
	}
	
	//metodo para calcular la cantidad generada
	private static double cantidadGenerada(double miCapital, double miInteres, double miPlazo){
		return (miCapital*(miInteres/12)/100)*(miPlazo);
	}
	
	//metodo para calcular la retecion aplicada
	private static double retencionCapital(double cantidad, double porcentaje){
		return (cantidad*porcentaje/100);
	}
	
	//metodo para calcular el total de ganancias
	private static double totalCobrar(double miCantidad, double miRetencion){
		return miCantidad-miRetencion;
	}	
}