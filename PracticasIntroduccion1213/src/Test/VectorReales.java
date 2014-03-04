package Test;

public class VectorReales {
	// Declaracion de varibles

	private static int numVectores=0;
	private double[] elementos;

	//Constructor del vector
	public VectorReales(int dim) {
		elementos = new double[dim];
		for (int i = 0; i < elementos.length; i++) {
			elementos[i] = (int) (Math.random() * 100);
		}
		numVectores++;
	}
	// Metodo mostar vector
	public String toString() {
		String res = "(";
		if (this.elementos == null)
			return res += "emtpy";
		for (int i = 0; i < elementos.length; i++) {
			res += elementos[i];
			if (i < this.elementos.length - 1) {
				res += ",";
			}
		}
		return res += ")";
	}

	public static int getNumVectores() {
		return numVectores;
	}
	// Metodo Sumar Vectores
	public VectorReales sumar(VectorReales v) {
		VectorReales vSuma = new VectorReales(this.elementos.length);
		for (int i = 0; i < this.elementos.length; i++) {
			vSuma.elementos[i] = this.elementos[i] + v.elementos[i];
		}
		return vSuma;
	}
	// Metodo Restar Vectores
	public VectorReales restar(VectorReales v) {
		VectorReales vResta = new VectorReales(this.elementos.length);
		for (int i = 0; i < this.elementos.length; i++) {
			vResta.elementos[i] = this.elementos[i] - v.elementos[i];
		}
		return vResta;
	}
	// Metodo para calcular el modulo de un vector
	public double norma() {
		double modulo = 0;
		double suma = 0;
		for (int i = 0; i < this.elementos.length; i++) {
			suma = suma + Math.pow(this.elementos[i], 2);
		}
		modulo = Math.sqrt(suma);
		return modulo;
	}
	// Metodo para el multiplicar por un escalar
	public VectorReales productoEscalar(double producto) {
		VectorReales vProducto = new VectorReales(this.elementos.length);
		for (int i = 0; i < this.elementos.length; i++) {
			vProducto.elementos[i] = (int) (this.elementos[i] * producto);
		}
		return vProducto;
	}
	// Metodo para multiplicar vectores
	public double productoEscalar(VectorReales v) {
		double res = 0;
		for (int i = 0; i < this.elementos.length; i++) {
			res += this.elementos[i] * v.elementos[i];
		}
		return res;
	}
	// Metodo para la distancia entre vectores
	public double distancia(VectorReales v) {
		double distancia = 0;
		distancia = (this.restar(v)).norma();
		return distancia;
	}
	// Metodo para calcular el angulo entre dos vectores
	public double angulo(VectorReales v) {
		double angulo = 0;

		angulo = Math.acos((this.productoEscalar(v))/ ((this.norma()) * (v.norma())));
		return angulo;
	}
	// Metodo para clonar vectores
	public VectorReales clone() {
		VectorReales vClon = new VectorReales(this.elementos.length);
		for (int i = 0; i < vClon.elementos.length; i++) {
			vClon.elementos[i] = this.elementos[i];
		}
		return vClon;
	}
	// Metodo para comparar vectores
	public boolean equals(Object vO) {
		VectorReales v = (VectorReales) vO;
		if (this == v)
			return true;
		if (v == null)
			return false;
		for (int i = 0; i < this.elementos.length; i++) {

			if (this.elementos[i] != v.elementos[i]) {
				return false;
			}
		}
		return true;
	}

	/*CARLOS
	//METODO PARA GT
	public VectorReales(double... array) {
		elementos = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			elementos[i] = array[i];
		}
		numVectores++;
	}
	//CONSTRUCTOR PARA GT4
	public VectorReales redimensionarClone(int dim) {
		double[] vecClone = new double[dim];
		for (int i = 0; i < this.elementos.length; i++) {
			vecClone[i] = this.elementos[i];
		}
		VectorReales vRedClon = new VectorReales(vecClone);
		return vRedClon;
	}
	//CONSTRUCTOR PARA GT2
	public void invertir(){
		double[]vecInvertir=new double[this.elementos.length];
		for(int i=0;i<vecInvertir.length;i++){
			vecInvertir[i]=elementos[(vecInvertir.length-1)-i];
		}
		this.elementos=vecInvertir;
		
	}
	//CONSTRUCTOR PARA GT3
	public VectorReales redimensionar(int dim) {
		double[] vecClone = new double[dim];
		for (int i = 0; i < this.elementos.length; i++) {
			vecClone[i] = this.elementos[i];
		}
		VectorReales vRedClon = new VectorReales(vecClone);
		return vRedClon;
	}*/
	//CONSTRUCTOR PARA GT1
	
	public VectorReales invertirClone() {
		double[]vecInvertir=new double[this.elementos.length];
		for(int i=0;i<vecInvertir.length;i++){
			vecInvertir[i]=elementos[(vecInvertir.length-1)-i];
			
			//si añado esta linea hace lo que el programa dice pero sale error
			//this.elementos=vecInvertir;
		}
		VectorReales vRedClon = new VectorReales(vecInvertir);
		return vRedClon;
}
	

	//METODOS PACO
//Constructor con parametros de otra.
	public VectorReales(double... array) {
		elementos = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			elementos[i] = array[i];
		}
		numVectores++;
	}
	//Constructor para el invertir clone
	public VectorReales(VectorReales vAuxi) {
		elementos=new double [vAuxi.elementos.length];
		for(int i=0;i<vAuxi.elementos.length;i++){
		
		elementos[i]=vAuxi.elementos[i];}
	}
	//Método que clona un vector invirtiendolo
	/*public VectorReales invertirClone(){
		VectorReales vAuxi=new VectorReales(this.elementos.length);
		for(int i=0;i<this.elementos.length;i++){
			vAuxi.elementos[i]=this.elementos[(this.elementos.length-1)-i];	
		}
		return vAuxi;
	}
	*/
	//CONSTRUCTOR PARA GT2
		public void invertir(){
			double[]vecInvertir=new double[this.elementos.length];
			for(int i=0;i<vecInvertir.length;i++){
				vecInvertir[i]=elementos[(vecInvertir.length-1)-i];
			}
			this.elementos=vecInvertir;
		}
	//Método que clona un vector redimensionandolo
	public VectorReales redimensionarClone(int dim) {
		double[] vecClone = new double[dim];
		for (int i = 0; i < this.elementos.length; i++) {
			vecClone[i] = this.elementos[i];
		}
		VectorReales vRedClon=new VectorReales(vecClone);
		return vRedClon;
	}
	public void redimensionar(int dim) {
		double[] vecAux = new double[dim];
		for (int i = 0; i < this.elementos.length; i++) {
			vecAux[i] = this.elementos[i];
		}
		this.elementos=vecAux;	
	}
}
