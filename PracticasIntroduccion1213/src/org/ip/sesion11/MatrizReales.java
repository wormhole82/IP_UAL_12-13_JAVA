package org.ip.sesion11;

public class MatrizReales {

	private double[][] elementos;
	private int filas;
	private int columnas;

	// CONSTRUCTOR
	MatrizReales(int dim1, int dim2) {
		this.elementos = new double[dim1][dim2];
		this.filas = dim1;
		this.columnas = dim2;

		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				elementos[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	// METODO SUMAR MATRICES
	public MatrizReales sumar(MatrizReales ArrayAux) {
		MatrizReales suma = new MatrizReales(filas, columnas);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				suma.elementos[i][j] = this.elementos[i][j] + ArrayAux.elementos[i][j];
			}
		}
		return suma;
	}

	// METODO RESTAR MATRICES
	public MatrizReales restar(MatrizReales ArrayAux) {
		MatrizReales resta = new MatrizReales(filas, columnas);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resta.elementos[i][j] = this.elementos[i][j] - ArrayAux.elementos[i][j];
			}
		}
		return resta;
	}

	// METODO CLONE()
	@Override
	public MatrizReales clone() {
		MatrizReales ObjetoArray = new MatrizReales(filas, columnas);

		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				ObjetoArray.elementos[i][j] = this.elementos[i][j];
			}
		}
		return ObjetoArray;
	}

	// METODO TOSTRING
	@Override
	public String toString() {
		String resultado = "";
		if (this.filas >= 10 || this.columnas >= 10) {
			resultado = "***DEMASIADOS ELEMENTOS***";
		} else {
			for (int i = 0; i < this.filas; i++) {
				resultado += "\n";
				for (int j = 0; j < this.columnas; j++) {
					resultado += this.elementos[i][j] + "\t";
				}
			}
		}
		return resultado;
	}

	// METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		MatrizReales matriz = (MatrizReales) obj;

		if (this == matriz)
			return true;
		if (matriz == null)
			return true;
		if (this.filas != matriz.filas || this.columnas != matriz.columnas)
			return false;
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				if (this.elementos[i][j] != matriz.elementos[i][j])
					return false;
			}
		}
		return true;
	}
}