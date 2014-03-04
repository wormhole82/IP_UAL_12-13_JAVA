package Examenes;

public class UsoInstalacionElectrica {

	public static void main(String[] args){
		
		//CREAMOS INSTALACION ELECTRICA
		InstalacionElectrica prueba=new InstalacionElectrica(6);
		System.out.println(prueba);
		System.out.println("Se estan consumiendo "+AparatoElectrico.getConsumoTotal()+" Watios\n");
		
		//PROBAMOS LOS METODOS ENCENDER Y APAGAR.
		prueba.getAparatos()[2].encender();
	
		System.out.println(prueba);
		System.out.println("Se estan consumiendo "+AparatoElectrico.getConsumoTotal()+" Watios\n");
	    prueba.getAparatos()[2].apagar();
	    prueba.getAparatos()[4].encender();
	    prueba.getAparatos()[3].encender();
		System.out.println(prueba);
		System.out.println("Se estan consumiendo "+AparatoElectrico.getConsumoTotal()+" Watios\n");
	}
}