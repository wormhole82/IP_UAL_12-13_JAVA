package Examenes;

public class InstalacionElectrica {
	
	private AparatoElectrico [] aparatos;
	
	//CONSTRUCTOR CON LA DIMENSION.
	public InstalacionElectrica(int dim){
		aparatos=(new AparatoElectrico[dim]);
		for(int i=0;i<dim;i++){
			this.aparatos[i]= new AparatoElectrico (1000+Math.random()*9000);
		}
	}
	//TOSTRING PARA INSTALACIONES ELECTRICAS.
	public String toString(){
		String instCasa="";
		for(int i =0;i<this.aparatos.length;i++){
			instCasa+="Aparato "+i+"\t"+this.getAparatos()[i]+"\n";
		}
		return instCasa;
	}
	//GETTER PARA APARATOS.
	public AparatoElectrico [] getAparatos() {
		return aparatos;
	}
}