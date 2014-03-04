package Examenes;

public class Parejas {

	private char[][] original;
	private int[][] emparejados;
	private int numParejas;
	private int numGrupos;
	
	//CONSTRUCTOR
	public Parejas(int dim1, int dim2) {
		original = new char [dim1][dim2];
		emparejados = new int [dim1][dim2];
		numParejas=0;
	}
	//GETTER
	public int getNumParejas() {
		return numParejas;
	}
	//GETTER
	public int getNumGrupos(){
		return numGrupos;
	}
	//METODO
	public void generaVocales() {
		int numRandom;
		for(int i = 0;i<original.length;i++){
			for(int j=0;j<original[0].length;j++){
				numRandom = (int)(Math.random()*5);
				if(numRandom==0) original[i][j] = 'a';
				else if(numRandom==1) original[i][j] = 'e';
				else if(numRandom==2) original[i][j] = 'i';
				else if(numRandom==3) original[i][j] = 'o';
				else original[i][j] = 'u';	
			}
		}
	}
	//METODO
	public void emparejaVocales() {
		boolean terminado;
		
		for(int i = 0;i<original.length;i++){
			for(int j=0;j<original[0].length;j++){
				
				if(emparejados[i][j]==0){
					terminado=false;
				
					for (int k=0;k<original.length&&terminado==false;k++){
					if ((original[i][j]==original[j][k])&&(emparejados[j][k]==0)&&(j!=k||i!=j)){ 
							numParejas++;
							emparejados[i][j]=numParejas;
							emparejados[j][k]=numParejas;
							terminado=true;
					}
				}
			}
		}
	}
}
					
	public void agruparVocalesEmparejadas() {
	}

	//TOSTRING
	@Override
	public String toString() {
		String aux = "\n Original";
		for (int i = 0; i < this.original.length; i++) {
			aux += "\n";
			for (int j=0; j < original[0].length; j++){
				aux += original[i][j]+"\t";
			}
		}
		aux +="\n Emparejados";
		for (int i = 0; i < this.emparejados.length; i++) {
			aux += "\n";
			for (int j=0; j < emparejados[0].length; j++){
				aux += emparejados[i][j]+"\t";
			}
		}
		return aux;
	}
}