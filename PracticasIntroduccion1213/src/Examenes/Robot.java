package Examenes;

public class Robot {
	
		private Coordenadas posicion;
		private int contadorObjetosMoviles;
		private int contadorObjetosFijos;

		private static int coordenadasDestinoY = 8;
		private static int velocidad;

		public Robot(Coordenadas posicion) {
			this.posicion = posicion;
		}
		public int getContadorObjetosMoviles() {
			return this.contadorObjetosMoviles;
		}
		public int getContadorObjetosFijos() {
			return this.contadorObjetosFijos;
		}
		public static void setVelocidad(int v) {
				velocidad = v;
		}
		public static int getVelocidad() {
			return velocidad;
		}
		public boolean desplazamiento(Coordenadas c) {
			if (this.posicion.getY() != coordenadasDestinoY)
		
		do {
			this.posicion.setX(this.posicion.getX() + c.getX());
			this.posicion.setY(this.posicion.getY() + c.getY());
					if (Math.random() * 2 < 1) {
						contadorObjetosMoviles++;
						System.out.println("click para foto");
					}
					contadorObjetosFijos++;
					System.out.println("hola");
					return true;
		} while (this.posicion.getY() != coordenadasDestinoY);
				else {
				return false;
			}
		}
		public String toString() {
			return "Numero de objetos moviles es: " + this.contadorObjetosMoviles
					+ "\nNumero de objetos fijos es: " + this.contadorObjetosFijos;
		}
	}