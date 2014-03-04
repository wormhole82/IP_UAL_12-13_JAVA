package Examenes;

public class AparatoElectrico {
	
	private double potencia;
	private boolean encendido;
	private static double consumoTotal=0;
	
	//CONSTRUCTOR
	public AparatoElectrico(double potencia){
		this.potencia=potencia;
		encendido=false;
	}
	//METODOS PARA OBTENER POTENCIA Y ENCENDIDO
	public double getPotencia(){
		return potencia;
	}
	public boolean getEncendido(){
		return encendido;
	}
	//DEVUELVE UN STRING CON EL ESTADO
	public String mostrarEstado(){
		String estado="";
		if(this.getEncendido())
			estado="ENCENDIDO";
		else
			estado="APAGADO";
		return estado;
	}
	//TO STRING DE APARATOS ELECTRICOS
	public String toString(){
		String cadena=+this.getPotencia()+" W  ("+this.mostrarEstado()+")\n";
		return cadena;
	}
	//METODO DE CLASE PARA OBTENER EL CONSUMO ACTUAL DE TODOS LOS APARATOS ENCENDIDOS
	public static double getConsumoTotal() {
		
		return consumoTotal;	
	}
	//METODOS PARA ENCENDER Y APAGAR APARATOS	
	public  void encender(){
		if (this.encendido==false){
			this.encendido=true;
			consumoTotal+=this.getPotencia();			
		}
	}
	public  void apagar(){
		if (this.encendido){
			this.encendido=false;
			consumoTotal-=this.getPotencia();		
		}
	}
}