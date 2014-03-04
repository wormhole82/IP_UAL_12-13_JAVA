package Actividad02;

public class Rectangulo {

	private int origenX,origenY;
	private int alto,ancho;
	
	//CONSTRUCTORES
	public Rectangulo(int origenX, int origenY, int ancho, int alto){
		this.origenX=origenX;
		this.origenY=origenY;
		this.ancho=ancho;
		this.alto=alto;
	}
	public Rectangulo(int ancho, int alto){
		this.origenX=0;
		this.origenY=0;
		this.ancho=ancho;
		this.alto=alto;
	}
	public Rectangulo(){
		this.origenX=0;
		this.origenY=0;
		this.ancho=0;
		this.alto=0;
	}
	//solucion actividad 2
	public Rectangulo(Rectangulo copia){
		this.origenX=copia.origenX;
		this.origenY=copia.origenY;
		this.ancho=copia.ancho;
		this.alto=copia.alto;
	}
	//METODOS
	public int calcularArea(){
		return alto*ancho;
	}
	public int calcularPerimetro(){
		return 2*alto+2*ancho;
	}
	public void desplazar(int dX, int dY){
		origenX+=dX;
		origenY+=dY;
	}
	public void redimensionar(int nuevoAncho, int nuevoAlto){
		this.ancho=nuevoAncho;
		this.alto=nuevoAlto;
	}
	//METODO TOSTRING
	public String toString(){
		return new String("Rectangulo de dimension "+alto+" x "+ancho+" con origen en ("+origenX+","+origenY+")");
	}
	public int getLongitud(){
		return ancho;
	}
	public int getAltura(){
		return alto;
	}
	public int getOrigenX(){
		return origenX;
	}
	public int getOrigenY(){
		return origenY;
	}
}