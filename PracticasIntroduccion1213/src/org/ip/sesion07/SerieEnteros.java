package org.ip.sesion07;

public class SerieEnteros {
	//DECLARACION DE VARIABLES
	private int valor;
	
	//CONSTRUCTOR
	public SerieEnteros(int valor){
		this.valor=valor;
	}
	//METODO TOSTRING PARA MOSTRAR LA CADENA
	public String toString(){
		String solucion = "{";
		for(int i=1; i<=this.valor; i++){
			solucion+=i;
			if(i<this.valor)
				solucion +=",";
		}
		solucion += "}";
		return solucion;
	}
	//METODO PARA CALCULAR LA SUMATORIA
	public int calcularSum(){
		int suma=0;
		for(int i=1;i<=this.valor;i++){
			suma+=i;
		}
		return suma;
	}
	//METODO PARA CALCULA LA MEDIA ARITMETICA
		public double mediaArit(){
			double media;
			media=this.calcularSum()/(double)this.valor;
			return media;
		}
	//METODO PARA CALCULAR EL PRODUCTORIO
	public int calcularProd(){
		int producto=1;
		for(int i=1;i<=this.valor;i++){
			producto*=i;
		}
		return producto;
	}
	//METODO PARA CALCULAR LA SUMA DE LOS NUMEROS PARES
	public int calcularSumPares(){
		int suma=0;
		for(int i=1;i<=this.valor;i++){
			if(i%2==0)
				suma+=i;
		}
		return suma;
	}
	//METODO PARA CALCULAR LA SUMA DE LOS NUMEROS IMPARES
	public int calcularSumImpares(){
		int suma=0;
		for(int i=0;i<=this.valor;i++){
			if(i%2!=0)
				suma+=i;
		}
		return suma;
	}
}