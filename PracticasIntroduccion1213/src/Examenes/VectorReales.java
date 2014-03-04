package Examenes;


public class VectorReales {


	// Atributos
	private double[] elementos;
	// private float dimension; No hace falta, porque dimensión=vector.length.
	private static int numVectores; // Es un atributo COMPARTIDO POR TODOS LOS OBJETOS v1&v2

	// Constructor
	public VectorReales(int dimension) {
		elementos = new double [dimension];
		for (int i = 0; i < dimension; i++) { // Método para inicializar vector con nº aleatorios
			elementos[i] = (int) (Math.random() * 90);
		}
		numVectores++;
	}
	
	//Constructor
	public VectorReales (int dim, String ele){
		int contador=0;
		elementos=new double [dim];
		String aux="";
		
		for (int i=0; i<ele.length(); i++){
			if(ele.charAt(i) != ','){
				aux += ele.charAt(i);
			}else{
				elementos[contador++]= Double.parseDouble(aux);
				aux="";
			}
		}
	  elementos[contador++]= Double.parseDouble(aux);
	}
	
	
	// ****Constructor
	public VectorReales (double ... array) {
			elementos = new double[array.length]; //Array de la longitud de todos los valores pasados por el constructor.
			
			for (int i=0; i<array.length;i++){ //array.length=elementos.length
				elementos[i] = array[i]; 
			}
			
			numVectores++;
		}

	// Get&set del atributo numVectores
	public static int getNumVectores() {
		return numVectores;
	}

	public VectorReales sumar(VectorReales vector2) {
		VectorReales resultadoSuma = new VectorReales(this.elementos.length); 
		// vector.length=dimensión || this.vector.length=dimensión del objeto que llama al método, que es v1.

		// Recorremos ambos vectores, se hace un SÓLO for porque tienen la misma dimensión.
		for (int i = 0; i < this.elementos.length; i++) {
			resultadoSuma.elementos[i] = this.elementos[i] + vector2.elementos[i]; 
		}	// Mete en el vector, la suma de ambos vectores.


		return resultadoSuma;
		
		/**
		 * CUANDO LAS DIMENSIONES DE LOS VECTORES SON DIFERENTES
		 * 
		 * if (this.elementos.length != vector2.elementos.length)
		 * return null;
		 * 
		 * ó
		 * 
		 * if (this.elementos.length != vector2.elementos.length)
		 * return nuew VectorReales(0); -> vectorVacío
		 * 
		 */
		
		
	}

	public VectorReales restar(VectorReales vector1) {

		// this.vector.length=dimensión del objeto que llama al método, que es v2.
		VectorReales resultadoResta = new VectorReales(this.elementos.length); 

		// Recorremos ambos vectores, se hace un SÓLO for porque tienen la misma dimensión.
		for (int i = 0; i < this.elementos.length; i++) {
			resultadoResta.elementos[i] = this.elementos[i] - vector1.elementos[i];
		}
		return resultadoResta;
	}

	public double norma() {
		double modulo = 0;

		for (int i = 0; i < this.elementos.length; i++) {
			modulo += Math.pow(this.elementos[i], 2);
		}
		return Math.sqrt(modulo);
	}

	public VectorReales productoEscalar(int escalar) {
		VectorReales resultadoProducto = new VectorReales(this.elementos.length);

		for (int i = 0; i < this.elementos.length; i++) {
			resultadoProducto.elementos[i]= escalar * this.elementos[i];
		}
		return resultadoProducto;
		
	}

	public double productoEscalar(VectorReales v) {
		
		if (this.elementos.length != v.elementos.length) 
			throw new RuntimeException ("Las dimensiones no coinciden");
		
		double producto = 0;

		for (int i = 0; i < this.elementos.length; i++) {
			producto += this.elementos[i] * v.elementos[i];
		}

		return producto;
	}

	public double distancia(VectorReales punto2) {
		VectorReales diferencia = new VectorReales(this.elementos.length);
		double cuadrado = 0;
		for (int i = 0; i < this.elementos.length; i++) {
			diferencia.elementos[i] = this.elementos[i] - punto2.elementos[i];
			cuadrado += Math.pow(diferencia.elementos[i], 2);
		}

		return Math.sqrt(cuadrado);

	}

	public double angulo(VectorReales otroVector) {
		double productoModulos;
		double division;

		norma(); // Módulo del vector que llama al método.
		otroVector.norma(); // Módulo del vector que se le pasa por parámetro al método.

		productoEscalar(otroVector); // producto de dos vectores.
		productoModulos = norma() * otroVector.norma(); // producto de los módulos.

		division = productoEscalar(otroVector) / productoModulos;

		return Math.acos(division);
	}

	// Clonamos el vector (copiar elementos en otro vector)
	@Override
	public VectorReales clone() {
		VectorReales vectorClonado = new VectorReales(this.elementos.length);

		// Le asigno todo los valores de this.vector al vector que debemos clonar.
		for (int i = 0; i < this.elementos.length; i++) {
			vectorClonado.elementos[i] = this.elementos[i]; 
		}

		return vectorClonado;
	}

	// Creamos nuestro método equals para comparar vectores
	public boolean equals(Object refObjeto) {
		VectorReales vec = (VectorReales) refObjeto; //Cast. 
		
		if (this == vec)
			return true;
		if (vec == null)
			return false;

		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] != vec.elementos[i])
				return false;
		}

		return true;

		/*
		 * boolean respuesta=true;
		 * 
		 * for (int i=0; i<this.vector.length; i++){ if (this.vector[i] !=
		 * vec.vector[i]){ respuesta=false; break; } }
		 * 
		 * return respuesta;
		 */

	}
	
	@Override
	public String toString() { // Nos devuelve el resultado que guarda un vector en una cadena de caracteres.
		String resultado = "(";
		for (int i=0; i<this.elementos.length; i++){
			resultado += this.elementos[i];
			if (i<this.elementos.length-1) 
				resultado+= ", ";
		}
		return resultado + ")";
	}
	
	public void redimensionar (int dimension){
		double [] vAux = new double [dimension];
		
		for (int i=0; i<this.elementos.length && i<dimension; i++){
			vAux[i]=this.elementos[i];
		}
		this.elementos=vAux;
	}
	
	/**
	  	public void redimensionar (int dimension){
		double [] vAux = new double [dimension];
		int dimMinima= Math.min(dimension, this.elementos.length);
		
		for (int i=0; i<dimMinima; i++){
			vAux[i]=this.elementos[i];
		}
		this.elementos=vAux;
		}
	 */
	
	
	// Método para invertir un array
		public void invertir (){
			double [] aux= new double [this.elementos.length];
			for (int i=0; i<aux.length; i++){
				aux[i]= elementos [(aux.length -1)-i];
			}
			this.elementos=aux;
		}
		
		public VectorReales invertir2 () {
			VectorReales vAux= new VectorReales (this.elementos.length);
			for (int i=0; i<this.elementos.length; i++){
				vAux.elementos[i]= this.elementos[(this.elementos.length-1)-i];
			}
			return vAux;
		}
		
	// Método para determinar si un vector es capicua no valido
		/*public boolean capicua2 (){
			double [] aux = new double [this.elementos.length];
			
			for(int i=0; i<this.elementos.length; i++){
				aux[i]= this.elementos [(aux.length -1)-i];
				
				for (int i1=0; i1>this.elementos.length; i1++){
					if (aux[i1] != this.elementos[i1])
						return false;
				}
			}
			return true;
		}
		*/
		public boolean capicua () {
			VectorReales vecAux = this.clone();
			vecAux.invertir();
			return this.equals(vecAux);
		}
			
}
