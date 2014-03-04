package org.ip.sesion06;

public class Bicicleta {
	
	//declaracion de variables
	private int cadencia, marcha, velocidad, id;
	private static int numeroBicicletas;
	
	//consutructor definido por el usuario
	public Bicicleta(int cadenciaInicio, int marchaInicio, int velocidadInicio) {
		cadencia=cadenciaInicio;
		marcha=marchaInicio;
		velocidad=velocidadInicio;
		id=++numeroBicicletas;
	//metodos de acceso	
	}
	public void setCadenacia(int nuevoValor){
		this.cadencia=nuevoValor;
	}
	public int getCadencia(){
		return this.cadencia;
	}
	public void setmarcha(int nuevoValor){
		this.marcha=nuevoValor;
	}
	public int getMarcha(){
		return this.marcha;
	}
	public int getVelocidad(){
		return this.velocidad;
	}
	public void frenar(int decremento){
		this.velocidad-=decremento;
	}
	public void acelerar(int incremento){
		this.velocidad+=incremento;
	}
	//Obtener numero de id
	public int getId(){
		return id;
	}
	//Obtener el numero de bicicletas
	public static int getNumeroBicicletas(){
		return numeroBicicletas;
	}
	//metodo para mostrar los atributos de un objeto
	public String toString(){
		String salida;
		salida="Cadencia: "+cadencia+"\nMarcha: "+marcha+"\nVelocidad: "+velocidad;
		return salida;
	}
}