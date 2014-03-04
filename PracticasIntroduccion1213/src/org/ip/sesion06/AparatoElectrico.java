package org.ip.sesion06;

public class AparatoElectrico {
	
	//declaracion de variables
	private int potencia; 
	private static float consumoTotal=0;
	private boolean encendido;
	
	//Constructor del aparto electrico
	public AparatoElectrico(int potencia){
		this.potencia=potencia;
		encendido=false;
		}
	//Metodo para encender los aparatos
	public void encender(){
		if(encendido==false){
			this.encendido=true;
			consumoTotal+=potencia;
		}
	}
	//Metodo para apagar los aparatos
	public void apagar(){
		if(encendido==true){
			this.encendido=false;
			consumoTotal-=potencia;
		}
	}
	//Metodo para calcular el consumo
	public static float consumo(){
		return consumoTotal;
	}
}