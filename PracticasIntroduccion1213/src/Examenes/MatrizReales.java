package Examenes;

public class MatrizReales {
	
	private double[][] elementos;
	private int numMatrices;
	
	//CONSTRUCTOR CON DIMENSIONES
	public MatrizReales(int dim1,int  dim2) {
		elementos = new double[dim1][dim2];
		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				elementos[i][j] =  Math.random() * 100;
			}
		}
		numMatrices++;
	}
	
	//PARA MOSTRAR MATRICES
	public String toString() {

		String res = "";
		if ((this.elementos.length) > 10 || (this.elementos[0].length > 20)) {
			res = "\t***\tDemasiados elementos\t***\t";
		} else {
			for (int i = 0; i < this.elementos.length; i++) {
				for (int j = 0; j < this.elementos[i].length; j++) {
					res += this.elementos[i][j] + "\t";
				}
				res += "\n";
			}
		}
		return res;
	}
	
	//SUMAR MATRICES
	public MatrizReales sumar(MatrizReales mat) {
		MatrizReales aux = new MatrizReales(elementos.length,elementos[0].length);

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				aux.elementos[i][j] = this.elementos[i][j]+ mat.elementos[i][j];
			}
		}
		return aux;

	}
	
	//RESTAR MATRICES
	public MatrizReales restar(MatrizReales mat) {
		MatrizReales aux = new MatrizReales(elementos.length,elementos[0].length);

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				aux.elementos[i][j] = this.elementos[i][j]- mat.elementos[i][j];
			}
		}
		return aux;

	}
	//CLONE
	public MatrizReales clone() {
		MatrizReales mClon = new MatrizReales(elementos.length,elementos[0].length);

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[1].length; j++) {
				mClon.elementos[i][j] = this.elementos[i][j];

			}
		}
		return mClon;
	}
	
	//EQUALS
	public boolean equals(Object oB) {
		MatrizReales mat = (MatrizReales) oB;
		if (this == mat)
			return true;
		if (mat == null)
			return false;
		if ((this.elementos.length!=mat.elementos.length)||(this.elementos[0].length!=mat.elementos[0].length))
		return false;

		for (int i = 0; i < this.elementos.length; i++) {
			for (int j = 0; j < this.elementos[i].length; j++) {

				if (this.elementos[i][j] != mat.elementos[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int getNumMatrices() {
		return numMatrices;
	}

	//METODO QUE REDIMENSIONA UNA MATRIZ.
	public void redimensionar(int nuevaDim1,int nuevaDim2){
	double[][] matAux=new double [nuevaDim1][nuevaDim2];
	
	for(int i=0;i<this.elementos.length&&i<nuevaDim1;i++){
		for(int j=0;j<this.elementos[i].length&&j<nuevaDim2;j++){
			matAux[i][j]=this.elementos[i][j];
			}
		}
		this.elementos=matAux;	
	}
	
	//CONSTRUCTOR A PARTIR DE UNA CADENA DE ELEMENTOS
	public MatrizReales (int dimen1,int dimen2,double...matAuxi){
		elementos= new double[dimen1][dimen2];
		
		for(int i=0;i<dimen1;i++){
			for(int j=0;j<dimen2;j++){
				this.elementos [i][j]= matAuxi[dimen2*i+j];
			}
		}
		numMatrices++;
	}
	
	//CONSTRUCTOR A PARTIR DE UN ARRAY BIDIMENSIONAL
	public MatrizReales( double[][] matAux) {
		elementos= new double[matAux.length][matAux[0].length];
		
		for(int i=0;i<this.elementos.length;i++){
			for(int j=0;j<this.elementos[i].length;j++){
				elementos [i][j]= matAux[i][j];
			}
		}	
		numMatrices++;
	}
	
	//REDIMENSIONAR CLONANDO LA MATRIZ PARA NO MACHACAR LA ORIGINAL
	public MatrizReales redimensionarClone(int nuevaDim1,int nuevaDim2){
	double[][] matAuxi=new double [nuevaDim1][nuevaDim2];
	
	for(int i=0;i<this.elementos.length&&i<nuevaDim1;i++){
		for(int j=0;j<this.elementos[0].length&&j<nuevaDim2 ;j++){
			matAuxi[i][j]=this.elementos[i][j];
			}
		}
		MatrizReales matRedClone=new MatrizReales(matAuxi);
		return matRedClone;			
	}
	
	//METODO PARA CALCULAR LA TRANSPUESTA(CREANDO OTRA)
	public MatrizReales transpuesta() {
		MatrizReales trans = new MatrizReales(this.elementos[0].length,this.elementos.length);

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				trans.elementos[j][i]=this.elementos[i][j];	
			}
		}
		return trans;
	}	
}