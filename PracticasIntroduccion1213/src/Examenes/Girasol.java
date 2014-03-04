package Examenes;

public class Girasol {
	private Coordenadas posicion;
	private int contadorLuz;
	private static boolean modo;

	public Girasol(Coordenadas posicion, int luz) {
		this.posicion = posicion;
		this.contadorLuz = luz;
	}
	public Coordenadas getPosicion() {
		return posicion;
	}
	public void setPosicion(Coordenadas posicion) {
		this.posicion = posicion;
	}
	public int getContadorLuz() {
		return contadorLuz;
	}
	public void setContadorLuz(int contadorLuz) {
		this.contadorLuz = contadorLuz;
	}
	public static boolean getModo() {
		return modo;
	}
	public static void setModo(boolean modo) {
		Girasol.modo = modo;
	}
	public boolean validarContador() {
		if (contadorLuz < 20) {
			return true;
		}else{
			return false;
		}
	}
	public String giro(int x) {

		if (validarContador() == true) {
			this.posicion.setX(x);
			this.contadorLuz++;
			return "";
		} else {
			return "El girasol ya puede ser recolectado";
		}
	}
}