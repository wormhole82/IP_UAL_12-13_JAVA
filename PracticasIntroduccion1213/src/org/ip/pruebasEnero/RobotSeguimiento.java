package org.ip.pruebasEnero;

public class RobotSeguimiento {
	
	private int [][] plano; //Posicion Inicio:1; Posicion Fin:2; Obstaculos:3; Ruta: 4
	private int numObstaculosE; // Numero de obstaculos encontrados
	
	public RobotSeguimiento (int dim1, int dim2){
			plano = new int [dim1][dim2];
			numObstaculosE=0;
	}
	
	public int getNumObstaculosE(){
		return numObstaculosE;
	}
	
	public void generaObstaculos(){
				
		for(int i=0;i<plano.length;i++){
			for(int j=0;j<plano[0].length;j++){
				if (Math.random()<0.2) plano[i][j]=3;
			}
		}
	}
	
	public void generaRuta(){
		
		int iMin,jMin,iMax,jMax,aux;
		iMin=(int)(Math.random()*plano.length);
		jMin=(int)(Math.random()*plano[0].length);
		iMax=(int)(Math.random()*plano.length);
		jMax=(int)(Math.random()*plano[0].length);
		if(iMin>iMax){
			aux=iMax;
			iMax=iMin;
			iMin=aux;
		}
		if(jMin>jMax){
			aux=jMax;
			jMax=jMin;
			jMin=aux;
		}
		if(iMin==iMax&&jMin==jMax){
			generaRuta();
		} else {
			plano[iMin][jMin]=1;
			plano[iMax][jMax]=2;
		}
		
	}
		
	public void recorreRuta(){
		int iIni,iFin,jIni,jFin;
		iIni=0;
		iFin=0;
		jIni=0;
		jFin=0;
		for(int i=0;i<plano.length;i++){
			for(int j=0;j<plano[0].length;j++){
				if (plano[i][j]==1){
					iIni=i;
					jIni=j;
				}
				if (plano[i][j]==2){
					iFin=i;
					jFin=j;
				}
			}
		}
		do	
			if(jIni!=jFin) {
				jIni++;
			if(plano[iIni][jIni]==3){
				numObstaculosE++;
				plano[iIni][jIni]=4;
			}
			else if(plano[iIni][jIni]==0){
				plano[iIni][jIni]=4;
			}
		}	else if(iIni!=iFin){
			iIni++;
			if(plano[iIni][jFin]==3){
				numObstaculosE++;
				plano[iIni][jFin]=4;
			}
			else if(plano[iIni][jFin]==0){
				plano[iIni][jIni]=4;
		}	else if (plano[iIni][jFin]==2){
			plano[iIni][jFin]=2;
		}
		}while(iIni!=iFin);

	}
	//Ejercicio extra
	public double distanciaEuclidea(){
		int iIni,iFin,jIni,jFin;
		iIni=0;iFin=0;jIni=0;jFin=0;
		for(int i=0;i<plano.length;i++){
			for(int j=0;j<plano[0].length;j++){
				if (plano[i][j]==1){
					iIni=i;
					jIni=j;
				}
				if (plano[i][j]==2){
					iFin=i;
					jFin=j;
				}
			}
		}
		return Math.sqrt(Math.pow((iIni-iFin),2)+(Math.pow((jIni-jFin),2)));
	}
	@Override
     public String toString(){
        String aux="\n Plano";
        for(int i=0;i<this.plano.length;i++){
        	aux+="\n";
        	for(int j=0;j<plano[0].length;j++){
        		aux +=plano[i][j]+"\t";
        	}
        }
        return aux;	
     } 
}