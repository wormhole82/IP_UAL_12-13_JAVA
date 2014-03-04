package Examenes;

public class Cubo {

	private int[][][] elementos;
	private int dimX;
	private int dimY;
	private int dimZ;
	//CONSTRUCTOR PASANDO 3 DIMENSIONES ENTERAS.
	public Cubo(int dimX, int dimY, int dimZ) {
		this.dimX=dimX;
		this.dimY=dimY;
		this.dimZ=dimZ;
		elementos = new int[dimX][dimY][dimZ];
		for (int i = 0; i < dimX; i++) {
			for (int j = 0; j < dimY; j++) {
				for (int k = 0; k < dimZ; k++) {
					elementos[i][j][k] = (int) (Math.random() * 100);
				}
			}
		}
	}
	//METODO QUE OBTIENE EL NUMERO DE VECES QUE SE REPITE EN EL CUBO UN VALOR QUE SE LE PASE.
	public int ocurrencias(int valor) {
		int ocurre = 0;
		
		for (int i = 0; i < this.dimX; i++) {
			for (int j = 0; j < this.dimY; j++) {
				for (int k = 0; k < this.dimZ; k++) {
					if (this.elementos[i][j][k] == valor) {
						ocurre++;
					}
				}
			}
		}
		return ocurre;
	}
	//METODO PARA SUMAR CUBOS 
	public Cubo sumar(Cubo otra) {
		Cubo cuboSuma = new Cubo(this.dimX,this.dimY, this.dimZ);
		for (int i = 0; i < this.dimX; i++) {
			for (int j = 0; j < this.dimY; j++) {
				for (int k = 0; k < this.dimZ; k++) {
					cuboSuma.elementos[i][j][k] = this.elementos[i][j][k]+ otra.elementos[i][j][k];
				}
			}
		}
		return cuboSuma;
	}
	//METODO PARA MOSTRAR CUBOS POR PANTALLA.
	public String toString() {
		String cubo = "";
		if (this.dimX>9||this.dimY>9||this.dimZ>9){
			cubo="**********Demasiados elementos************";
		}
		else
			for (int i = 0; i < this.dimX; i++) {
				for (int j = 0; j < this.dimY; j++) {
					for (int k = 0; k < this.dimZ; k++) {
					cubo += this.elementos[i][j][k] +"\t";
				}
				cubo += "\n";
			}
			cubo += "\n\n\n";
		}
		return cubo;
	}
}