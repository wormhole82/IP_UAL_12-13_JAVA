package org.ip.sesion10;

public class VectorReales {

	private static int numObjetos = 0;
	private double[] objetoArray;

	// CONSTRUCTOR 1.0 VECTOR REALES
	public VectorReales(int dim) {
		objetoArray = new double[dim];
		for (int i = 0; i < objetoArray.length; i++) {
		objetoArray[i] = (int) (Math.random() * 100);
		}
		numObjetos++;
	}
	/*
	 //CONSTRUCTOR 2.0 VECTOR REALES VISTO EN CLASE, NO VALE, ????????(PREGUNTAR) 
	
	public VectorReales(double... array) {
		objetoArray = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			objetoArray[i] = array[i];
		}
		numObjetos++;
	}
	*/

	// GET NUMERO VECTORES
	public static int getNumVectores() {
		return numObjetos;
	}

	// METODO TOSTRING MOSTRAR RESULTADOS
	@Override
	public String toString() {
		String vec = "(";
		if (this.objetoArray == null)
			return vec += "emtpy";
		for (int i = 0; i < objetoArray.length; i++) {
			vec += objetoArray[i];
			if (i < this.objetoArray.length - 1) {
				vec += ",";
			}
		}
		return vec += ")";
	}

	// METODO SUMAR VECTORES
	public VectorReales sumar(VectorReales vecTotal) {
		VectorReales vectorSuma = new VectorReales(this.objetoArray.length);
		for (int i = 0; i < this.objetoArray.length; i++) {
			vectorSuma.objetoArray[i] = this.objetoArray[i]+ vecTotal.objetoArray[i];
		}
		return vectorSuma;
	}

	// METODO RESTAR VECTORES
	public VectorReales restar(VectorReales vecTotal) {
		VectorReales vectorRestar = new VectorReales(this.objetoArray.length);
		for (int i = 0; i < this.objetoArray.length; i++) {
			vectorRestar.objetoArray[i] = this.objetoArray[i]- vecTotal.objetoArray[i];
		}
		return vectorRestar;
	}

	// METODO CALCULAR MODULO
	public double norma() {
		double modulo = 0;
		double suma = 0;
		for (int i = 0; i < objetoArray.length; i++) {
			suma = suma + Math.pow(objetoArray[i], 2);
		}
		modulo = Math.sqrt(suma);
		return modulo;
	}

	// METODO MULTIPLICAR POR ESCALAR
	public VectorReales productoEscalar(double producto) {
		VectorReales vProducto = new VectorReales(objetoArray.length);
		for (int i = 0; i < objetoArray.length; i++) {
			vProducto.objetoArray[i] = (int) (this.objetoArray[i] * producto);
		}
		return vProducto;
	}

	// METODO MULTIPLICAR VECTORES
	public double productoEscalar(VectorReales v) {
		double res = 0;
		for (int i = 0; i < objetoArray.length; i++) {
			res += this.objetoArray[i] * v.objetoArray[i];
		}
		return res;
	}

	// METODO DISTANCIA ENTRE VECTORES
	public double distancia(VectorReales v) {
		double distancia = 0;
		distancia = (this.restar(v).norma());
		return distancia;
	}

	// METODO CALCULAR ANGULO ENTRE VECTORES
	public double angulo(VectorReales v) {
		double angulo = 0;
		angulo = Math.acos((this.productoEscalar(v))/ ((this.norma()) * (v.norma())));
		return angulo;
	}

	// METODO CLONAR VECTOR REAL
	@Override
	public VectorReales clone() {
		VectorReales vClon = new VectorReales(this.objetoArray.length);
		for (int i = 0; i < vClon.objetoArray.length; i++) {
			vClon.objetoArray[i] = this.objetoArray[i];
		}
		return vClon;
	}

	// METODO PARA COMPARAR VECTORES
	@Override
	public boolean equals(Object vO) {
		/* Un objeto del tipo Objetc es un objeto en si mismo, se puede utilizar para compararse con otro objeto a traves del equals, y no es lo mismo
		 * que utilizar "==" ya que esto compara si 2 referencias a objetos apuntan al mismo objeto. 
		 * Solo delvolviera "true" si los objetos son iguales en su totalidad.
		 */
		VectorReales v = (VectorReales) vO;
		if (this == v)
			return true;
		if (v == null)
			return false;
		/*ESTA PARTE NO INFLUYE EN EL RESULTADO, TAMPOCO TENGO CLARO PARA QUE SIRVE ???????(PREGUNTAR)
		ESTO MISMO YA LO HACE LA CLASE OBJECT CON EL EQUALS Y NO HARIA FALTA PONERLO NO??
		
		for (int i = 0; i < objetoArray.length; i++) {
			if (this.objetoArray[i] != v.objetoArray[i]) {
			return false;
			}
				}*/
		return true;
		}
	}